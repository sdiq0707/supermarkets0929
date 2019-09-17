package com.woniu.service;

import java.util.List;

import com.woniu.domain.Producttype;


public interface IProducttypeService {
    void save (Producttype producttype);
    void delete(Integer ptypeid);
    void update(Producttype producttype);
    Producttype select(Integer ptypeid);
    List<Producttype> select();
}
