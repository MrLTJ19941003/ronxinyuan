package com.RouXinYuan.service.impl;

import com.RouXinYuan.bean.Product;
import com.RouXinYuan.dao.ProductDao;
import com.RouXinYuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> queryProductAll() {
        return productDao.queryProductAll();
    }

    @Override
    public Product queryProductShow(int id) {
        return productDao.queryProductShow(id);
    }
}
