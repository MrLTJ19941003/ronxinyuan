package com.RouXinYuan.Collection;

import com.RouXinYuan.bean.Product;
import com.RouXinYuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 13045 on 2018/1/17.
 */
@RequestMapping("/product")
@Controller
public class ProductCollection {

    @Autowired
    ProductService productService;
    /**
     * 跳转至关于产品展示界面,并查询产品表中所有数据
     */
    @RequestMapping("/about_product")
    public String queryProductAll(Model model){
        List<Product> list = productService.queryProductAll();
        model.addAttribute("listProduct",list);
        return "about_product";
    }

    /**
     * 跳转至关于产品内容展示界面,并根据ID查询具体内容
     */
    @RequestMapping("/product_show")
    public String queryProductShow(Model model, @RequestParam(value="id") int id){
        Product product = productService.queryProductShow(id);
        model.addAttribute("product",product);
        return "/product/product_show";
    }

}
