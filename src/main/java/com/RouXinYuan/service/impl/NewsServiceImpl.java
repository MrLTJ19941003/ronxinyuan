package com.RouXinYuan.service.impl;

import com.RouXinYuan.bean.News;
import com.RouXinYuan.dao.NewsDao;
import com.RouXinYuan.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 13045 on 2018/1/18.
 */
@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> queryAll(int count,String name) {
        return newsDao.queryAll(count,name);
    }
}
