package com.RouXinYuan.dao;

import com.RouXinYuan.bean.RadioBroadcast;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
public interface RadioBroadcastDao {
    List<RadioBroadcast> queryAll();

    RadioBroadcast queryForID(int id);

}
