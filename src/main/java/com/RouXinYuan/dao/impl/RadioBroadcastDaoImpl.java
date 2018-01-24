package com.RouXinYuan.dao.impl;

import com.RouXinYuan.bean.RadioBroadcast;
import com.RouXinYuan.dao.RadioBroadcastDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
@Repository
public class RadioBroadcastDaoImpl implements RadioBroadcastDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<RadioBroadcast> queryAll() {
        List<RadioBroadcast> list = jdbcTemplate.query("select id,title,url,content,createTime from radiobroadcast", new Object[]{}, new BeanPropertyRowMapper(RadioBroadcast.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public RadioBroadcast queryForID(int id) {
        List<RadioBroadcast> list = jdbcTemplate.query("select id,title,url,content,createTime from radiobroadcast where id = ?", new Object[]{id}, new BeanPropertyRowMapper(RadioBroadcast.class));
        if(list!=null && list.size()>0){
            RadioBroadcast radioBroadcast = list.get(0);
            return radioBroadcast;
        }else{
            return null;
        }
    }
}
