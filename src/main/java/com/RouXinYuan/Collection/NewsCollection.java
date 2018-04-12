package com.RouXinYuan.Collection;

import com.RouXinYuan.bean.News;
import com.RouXinYuan.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 13045 on 2018/1/18.
 * 新闻模块
 */
@RequestMapping("/news")
@Controller
public class NewsCollection {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/list")
    public String toNewsQuery(ModelMap model){
        return "/news/list";
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<News> queryAll(){
        List<News> newsList = newsService.queryAll(0,"");
        return newsList;
    }


}
