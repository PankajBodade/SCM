package com.demo;

import com.demo.controller.PromotionEngineController;
import com.demo.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class PromotionEngineApplication {
    public static void main(String[] args) throws Exception {

        //scenario 1
        List<Product> productList = initScenario1();
        PromotionEngineController promotionEngineController = new PromotionEngineController();
        int checkoutTotal = promotionEngineController.checkoutProduct(productList);


        //scenario 2
        productList = initScenario2();
        promotionEngineController = new PromotionEngineController();
        checkoutTotal = promotionEngineController.checkoutProduct(productList);


        //scenario 3
        productList = initScenario3();
        promotionEngineController = new PromotionEngineController();
        checkoutTotal = promotionEngineController.checkoutProduct(productList);


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
