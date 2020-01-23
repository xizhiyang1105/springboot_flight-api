package com.fh.service.impl;

import com.fh.action.YH.ServletRequest;
import com.fh.dao.FlightDao;
import com.fh.model.Flight;
import com.fh.model.Query;
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
    public void updateProductStatus(Integer id, Integer zt) {
        Flight flight =new Flight();
        flight.setId(id);
        flight.setZt(zt);
        flightDao.updateStatus(flight);
    }
}
