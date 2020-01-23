package com.fh.service;

import com.fh.action.YH.ServletRequest;
import com.fh.model.Query;

public interface FlightService {
    ServletRequest queryFlightList(Query query);

    void updateProductStatus(Integer id, Integer zt);
}
