package com.wang.gmall.pms.controller;

import com.wang.gmall.pms.entity.Product;
import com.wang.gmall.pms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    public Object getObj(){
        Product pro= productService.getById(43);
        return pro;
    }
}
