package com.RouXinYuan.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 13045 on 2018/3/13.
 * 招募模块
 */
@RequestMapping("/recreit")
@Controller
public class RecreitCollection {
    @RequestMapping("/list")
    public String toNewsQuery(ModelMap model){
        return "/recreit/list";
    }
}
