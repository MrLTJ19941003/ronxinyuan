package com.RouXinYuan.service;

import com.RouXinYuan.bean.News;

import java.util.List;

/**
 * Created by 13045 on 2018/1/18.
 */
public interface NewsService {

    List<News> queryAll(int count,String name);
}
