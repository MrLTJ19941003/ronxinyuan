package com.RouXinYuan.dao.impl;

import com.RouXinYuan.bean.News;
import com.RouXinYuan.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13045 on 2018/1/18.
 */
@Repository
public class NewsDaoImpl implements NewsDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<News> queryAll(int count,String name) {
        List<News> list = new ArrayList<News>();
        if(name.equals("index")){
            list = jdbcTemplate.query("select * from news where news_status = '0' limit 0,?", new Object[]{count}, new BeanPropertyRowMapper(News.class));
        }else{
            list = jdbcTemplate.query("select * from news where news_status = '0'", new Object[]{}, new BeanPropertyRowMapper(News.class));
        }
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
