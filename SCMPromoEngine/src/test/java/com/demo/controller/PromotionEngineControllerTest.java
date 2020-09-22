package com.demo.controller;

import com.demo.entity.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PromotionEngineControllerTest {
    @Test
    public void checkoutProductTest1() throws Exception {
        //scenario 1
        List<Product> productList = initScenario1();
        PromotionEngineController promotionEngineController = new PromotionEngineController();
        int checkoutTotal = promotionEngineController.checkoutProduct(productList);

        assertEquals(checkoutTotal, 100);
    }
    @Test
    public void checkoutProductTest2() throws Exception {
        //scenario 1
        List<Product> productList = initScenario2();
        PromotionEngineController promotionEngineController = new PromotionEngineController();
        int checkoutTotal = promotionEngineController.checkoutProduct(productList);

        assertEquals(checkoutTotal, 370);
    }
    @Test
    public void checkoutProductTest3() throws Exception {
        //scenario 1
        List<Product> productList = initScenario3();
        PromotionEngineController promotionEngineController = new PromotionEngineController();
        int checkoutTotal = promotionEngineController.checkoutProduct(productList);

        assertEquals(checkoutTotal, 280);
    }




        private static List<Product> initScenario2() {
        List<Product> productList = new ArrayList<Product>();

        Product product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("C");
        product.setQuantity(1);
        product.setProductPrice(20);
        productList.add(product);

        return productList;
    }

    private static List<Product> initScenario3() {
        List<Product> productList = new ArrayList<Product>();

        Product product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("C");
        product.setQuantity(1);
        product.setProductPrice(20);
        productList.add(product);

        product = new Product();
        product.setProductName("D");
        product.setQuantity(1);
        product.setProductPrice(15);
        productList.add(product);

        return productList;
    }

    private static List<Product> initScenario1() {
        List<Product> productList = new ArrayList<Product>();

        Product product = new Product();
        product.setProductName("A");
        product.setQuantity(1);
        product.setProductPrice(50);
        productList.add(product);

        product = new Product();
        product.setProductName("B");
        product.setQuantity(1);
        product.setProductPrice(30);
        productList.add(product);

        product = new Product();
        product.setProductName("C");
        product.setQuantity(1);
        product.setProductPrice(20);
        productList.add(product);

        return productList;
    }


}
