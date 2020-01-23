package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Flight;
import com.fh.model.Query;

import java.util.List;

public interface FlightDao extends BaseMapper<Flight> {
    Integer queryCount(Query query);

    List queryList(Query query);

    void updateStatus(Flight flight);
}
