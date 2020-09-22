package com.demo.controller;

import com.demo.entity.Product;
import com.demo.service.PromotionEngineService;

import java.util.List;

public class PromotionEngineController {

    PromotionEngineService promotionEngineService;

    public int checkoutProduct(List<Product> productList) throws Exception {
        return new PromotionEngineService().checkoutProduct(productList);
    }

}
