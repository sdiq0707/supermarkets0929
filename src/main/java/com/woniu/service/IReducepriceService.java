package com.woniu.service;

import java.util.List;

import com.woniu.domain.Reduceprice;

public interface IReducepriceService {
    void save (Reduceprice reduceprice);
    void delete(Integer rid);
    void update(Reduceprice reduceprice);
    Reduceprice select(Integer rid);
    List<Reduceprice> select();
}
