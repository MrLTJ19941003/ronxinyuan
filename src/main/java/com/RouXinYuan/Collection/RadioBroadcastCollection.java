package com.RouXinYuan.Collection;

import com.RouXinYuan.bean.RadioBroadcast;
import com.RouXinYuan.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 * 广播模块
 */
@RequestMapping("/plus")
@Controller
public class RadioBroadcastCollection {

    @Autowired
    IndexService indexService;

    /**
     * 获取广播列表
     */
    @RequestMapping("/listquery")
    @ResponseBody
    public List<RadioBroadcast> toPlusListQuery(){
        List<RadioBroadcast> list = indexService.queryAll();
        return list;
    }

    /**
     * 根据广播ID获取广播具体内存
     */
    @RequestMapping("/show")
    public String toPlusShowId(Model model,@RequestParam(value="id") int id){
        RadioBroadcast radioBroadcast = indexService.queryForID(id);
        model.addAttribute("radioBroadcast", radioBroadcast);
        return "/plus/show";
    }
}
