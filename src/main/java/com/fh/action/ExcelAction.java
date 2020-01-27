package com.fh.action;

import com.fh.model.Flight;
import com.fh.model.Query;
import com.fh.service.FlightService;
import com.fh.util.Excel_Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("excel")
@CrossOrigin
public class ExcelAction {
    @Autowired
    private FlightService flightService;

    @RequestMapping("downExcel")
    public void downExcel(HttpServletResponse response, Query query){
        List<Flight> list= flightService.querylist(query);
        Excel_Util.downExcel(list,response);
    }
}
