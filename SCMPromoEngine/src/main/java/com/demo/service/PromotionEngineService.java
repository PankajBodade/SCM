package com.demo.service;

import com.demo.entity.Product;
import com.demo.utils.Utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class PromotionEngineService {

    public int checkoutProduct(List<Product> productList) throws Exception {
        int producTotalBeforePromo = 0;
        String productNamePromoCheck = "";
        for (Product product : productList) {
            producTotalBeforePromo += product.getProductPrice();
            productNamePromoCheck += product.getProductName();
        }



        //check promotions
        return checkPromotion(producTotalBeforePromo, productNamePromoCheck);
    }

    private int checkPromotion(int producTotalBeforePromo, String productNamePromoCheck) throws IOException {
        int productTotalPostPromo = 0;
        Utils utils = new Utils();

        String promotionConfigFile = "promotion.properties";
        Map<String, String> promotionMap = utils.getPropValues(promotionConfigFile);


        String productConfigFile = "product.properties";
        Map<String, String> productMap = utils.getPropValues(productConfigFile);


        for (Map.Entry<String, String> entry : promotionMap.entrySet()) {
            String promoKey = entry.getKey();

            String promoValue = promotionMap.get(entry.getKey());

            int promoKeyOccurances = (productNamePromoCheck.split(promoKey, -1).length) - 1;
            if (productNamePromoCheck.contains(promoKey)) {
                int promoProductTotal = 0;
                for (char ch : promoKey.toCharArray()) {
                    String productUnitValue = productMap.get(String.valueOf(ch));
                    promoProductTotal += Integer.parseInt(productUnitValue);
                }

                productTotalPostPromo = producTotalBeforePromo - ((promoProductTotal - Integer.parseInt(promoValue)) * promoKeyOccurances);

                //assign revised value of producTotalBeforePromo
                producTotalBeforePromo = productTotalPostPromo;


            } else {
                productTotalPostPromo = producTotalBeforePromo;

            }
        }
        return productTotalPostPromo;
    }

}
