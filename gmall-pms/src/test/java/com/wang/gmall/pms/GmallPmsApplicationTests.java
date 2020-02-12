package com.wang.gmall.pms;

import com.wang.gmall.pms.entity.Product;
import com.wang.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Test
    void contextLoads() {

        Product product = productService.getById(43);
//        Product p = new Product();
//        p.setId(43L);
//        p.setName("啵啵啵欧巴");
//        productService.updateById(p);
        System.out.println(product.getName());

    }

}
