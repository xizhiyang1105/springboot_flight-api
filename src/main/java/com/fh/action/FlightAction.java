package com.fh.action;

import com.fh.action.YH.ServletRequest;
import com.fh.model.Query;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    public  ServletRequest updateProductStatus(Integer id,Integer zt){
        flightService.updateProductStatus(id,zt);
        return ServletRequest.success();
    }


}
