package com.fh.service;

import com.fh.action.YH.ServletRequest;
import com.fh.model.Area;
import com.fh.model.Flight;
import com.fh.model.Query;

import java.util.List;

public interface FlightService {
    ServletRequest queryFlightList(Query query);

    void updateProductStatus(Flight flight);

    List<Area> queryAreaListBypid(Integer pid);

    ServletRequest queryTypeList();

    ServletRequest addFlight(Flight flight);

    List<Flight> querylist(Query query);

    void upFlightByList(List list);
}
