package com.RouXinYuan.dao.impl;

import com.RouXinYuan.bean.Product;
import com.RouXinYuan.bean.RadioBroadcast;
import com.RouXinYuan.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Product> queryProductAll() {
       // List<Product> list = jdbcTemplate.queryForList("select * from product",new BeanPropertyRowMapper(Product.class));
       List<Product> list = jdbcTemplate.query("select * from product where product_status = '0'", new Object[]{}, new BeanPropertyRowMapper(Product.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    @Override
    public Product queryProductShow(int id) {
        List<Product> list = jdbcTemplate.query("select * from product  where product_status = '0' and  id = ?", new Object[]{id}, new BeanPropertyRowMapper(Product.class));
        if (list != null && list.size() > 0) {
            Product product = list.get(0);
            return product;
        } else {
            return null;
        }
    }
}
