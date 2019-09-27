package com.woniu.service;

import java.util.List;

import com.woniu.domain.Product;

public interface IProductService {
    void save (Product product);
    void delete(Integer productid);
    void update(Product product);
    Product select(Integer productid);
    void upAndDown(Integer productid);
    List<Product> select();
    List<Product> select(String name);
}
