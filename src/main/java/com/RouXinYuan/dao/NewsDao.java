package com.RouXinYuan.dao;

import com.RouXinYuan.bean.News;

import java.util.List;

/**
 * Created by 13045 on 2018/1/18.
 */
public interface NewsDao {
    List<News> queryAll(int count,String name);
}
