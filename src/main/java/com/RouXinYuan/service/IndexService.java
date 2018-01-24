package com.RouXinYuan.service;

import com.RouXinYuan.bean.RadioBroadcast;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 13045 on 2018/1/12.
 */
public interface IndexService {
    List<RadioBroadcast> queryAll();

    RadioBroadcast queryForID(int id);
}
