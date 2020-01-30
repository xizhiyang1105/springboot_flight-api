package com.fh.service.impl;

import com.fh.action.YH.ServletRequest;
import com.fh.dao.FlightDao;
import com.fh.dao.TicketDao;
import com.fh.model.*;
import com.fh.service.FlightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FlightServiceImpl implements FlightService {
    @Resource
    private FlightDao flightDao;
    @Resource
    private TicketDao ticketDao;

    @Override
    public ServletRequest queryFlightList(Query query) {
        Map map=new HashMap();
        Integer count=flightDao.queryCount(query);
        List drugList=flightDao.queryList(query);
        map.put("draw",query.getDraw());
        map.put("recordsTotal",count);
        map.put("recordsFiltered",count);
        map.put("data",drugList);
        return ServletRequest.success(map);
    }

    @Override
    public void updateProductStatus(Flight flight) {
        flight.setId(flight.getId());
        flight.setZt(flight.getZt());
        flightDao.updateStatus(flight);
    }

    @Override
    public List<Area> queryAreaListBypid(Integer pid) {
        return flightDao.queryAreaListBypid(pid);
    }

    @Override
    public ServletRequest queryTypeList() {
        List<Type> list=flightDao.queryTypeList();
        return ServletRequest.success(list);
    }

    @Override
    public ServletRequest addFlight(Flight flight) {
        Integer acount = flight.getAcount();
        double aprice = flight.getAprice();
        Integer bcount = flight.getBcount();
        double bprice = flight.getBprice();
        flightDao.insert(flight);
        Ticket ticket=new Ticket();
        ticket.setFlightId(flight.getId());
        if(acount!=null){
            ticket.setFlightcount(acount);
        }
        if(aprice!=0){
            ticket.setPrice(aprice);
        }
        ticket.setType(2);
        ticketDao.insert(ticket);
        Ticket ticket1=new Ticket();
        ticket1.setFlightId(flight.getId());
        if(bcount!=null){
            ticket1.setFlightcount(bcount);
        }
        if(bprice!=0){
            ticket1.setPrice(bprice);
        }
        ticket1.setType(1);
        ticketDao.insert(ticket1);
        return ServletRequest.success();
    }

    @Override
    public List<Flight> querylist(Query query) {
        List<Flight> list =flightDao.querylist(query);
        return list;
    }

    @Override
    public void upFlightByList(List list) {
        for (int i = 0; i <list.size() ; i++) {
            flightDao.upFlightByList(Integer.parseInt((String) list.get(i)));
        }
    }
}
