package com.RouXinYuan.service.impl;

import com.RouXinYuan.bean.RadioBroadcast;
import com.RouXinYuan.dao.RadioBroadcastDao;
import com.RouXinYuan.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
@Service
public class IndexServcieImpl implements IndexService{

    @Autowired
    RadioBroadcastDao radioBroadcastDao;

    @Override
    public List<RadioBroadcast> queryAll() {
        return radioBroadcastDao.queryAll();
    }

    @Override
    public RadioBroadcast queryForID(int id) {
        return radioBroadcastDao.queryForID(id);
    }
}
