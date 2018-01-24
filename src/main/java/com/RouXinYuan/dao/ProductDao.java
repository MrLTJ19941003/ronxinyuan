package com.RouXinYuan.dao;

import com.RouXinYuan.bean.Product;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
public interface ProductDao {
    List<Product> queryProductAll();

    Product queryProductShow(int id);
}
