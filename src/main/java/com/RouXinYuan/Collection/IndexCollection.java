package com.RouXinYuan.Collection;

import com.RouXinYuan.bean.News;
import com.RouXinYuan.bean.RadioBroadcast;
import com.RouXinYuan.service.IndexService;
import com.RouXinYuan.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13045 on 2018/1/12.
 * 首页跳转及首页管理
 */
@Controller
public class IndexCollection {

    @Autowired
    private IndexService indexService;
    @Autowired
    private NewsService newsService;

    /**
     * 跳转至pc端首页，并初始化首页所需数据
     */
    @RequestMapping("/")
    public String toIndex(ModelMap model){
        initIndex(model);
        return "index";
    }

    /**
     * 跳转至pc端首页，并初始化首页所需数据
     */
    @RequestMapping("/index_mobile")
    public String toIndex_mobile(ModelMap model){
        initIndex(model);
        return "index_mobile";
    }
    /**
     * 跳转至关于我们界面
     */
    @RequestMapping("/about_us")
    public String toAboutUs(){
        return "about_us";
    }

    /**
     * 跳转至广播列表查询界面
     */
    @RequestMapping("/plus/list")
    public String toPlusList(){
        return "plus/list";
    }


    /**
     * 获取首页轮播图集合
     */
    @RequestMapping("/getImageUrl")
    @ResponseBody
    public List<String> getImageUrl(){
        List<String> listImage = new ArrayList<String>();
        listImage.add("/image/index/index_02.webp");
        listImage.add("/image/index/index_03.webp");
        listImage.add("/image/index/index_04.webp");
        listImage.add("/image/index/index_05.webp");
        listImage.add("/image/index/index_06.webp");
        return listImage;
    }


    /**
     * 首页数据初始化（公共方法）
     * @param model
     */
    private void initIndex(ModelMap model){
        List<RadioBroadcast> radioBroadcastList = indexService.queryAll();
        model.addAttribute("radioBroadcast", radioBroadcastList);

        List<News> newsList = newsService.queryAll(5,"index");
        model.addAttribute("newsList",newsList);

        List<String> listImage = new ArrayList<String>();
        listImage.add("/image/index/index_02.webp");
        listImage.add("/image/index/index_03.webp");
        listImage.add("/image/index/index_04.webp");
        listImage.add("/image/index/index_05.webp");
        listImage.add("/image/index/index_06.webp");
        model.addAttribute("listImage", listImage);
    }
}
