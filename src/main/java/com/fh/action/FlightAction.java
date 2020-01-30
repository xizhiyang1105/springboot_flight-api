package com.fh.action;

import com.fh.action.YH.ServletRequest;
import com.fh.model.Area;
import com.fh.model.Flight;
import com.fh.model.Query;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("flight")
public class FlightAction {
    @Autowired
    private FlightService flightService;

    @RequestMapping("queryFlightList")
    public ServletRequest queryFlightList(Query query){
        return flightService.queryFlightList(query);
    }

    @RequestMapping("updateStatus")
    @ResponseBody
    public  ServletRequest updateProductStatus(Flight flight){
        flightService.updateProductStatus(flight);
        return ServletRequest.success();
    }

    //根据pid来查询地区
    @RequestMapping("queryAreaListBypid")
    public ServletRequest queryAreaListBypid(Integer pid){
        List<Area> list=flightService.queryAreaListBypid(pid);
        return ServletRequest.success(list);
    }

    @RequestMapping("queryTypeList")
    public ServletRequest queryTypeList(){
        return flightService.queryTypeList();
    }

    @RequestMapping("addFlight")
    public ServletRequest addFlight(Flight flight){
        return flightService.addFlight(flight);
    }

    @RequestMapping("upFlightByList")
    public ServletRequest upFlightByList(@RequestParam("ids[]") List list){
        flightService.upFlightByList(list);
        return ServletRequest.success();
    }


}
