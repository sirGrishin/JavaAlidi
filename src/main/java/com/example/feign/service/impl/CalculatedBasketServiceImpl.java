package com.example.feign.service.impl;

import com.example.feign.client.PostFeignClient;
import com.example.feign.model.Basket;
import com.example.feign.model.CalculatedBasket;
import com.example.feign.service.CalculatedBasketService;
import com.example.feign.util.PaymentEnum;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ilya Grishin
 */
@Service
public class CalculatedBasketServiceImpl implements CalculatedBasketService {
    private final PostFeignClient feignClient;

    public CalculatedBasketServiceImpl(PostFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public CalculatedBasket calculate(Basket[] baskets, PaymentEnum paymentEnum, String userAddress) {
        CalculatedBasket calculatedBasket = new CalculatedBasket();
        Map<Basket, Float> basketFloatHashMap = new HashMap<>();
        Float fullSum = 0F;
        for (Basket basket : baskets) {
            Float productSum = feignClient.calculatePrice(basket);
            basketFloatHashMap.put(basket, productSum);
            fullSum += productSum;
        }
        calculatedBasket.setBasketMap(basketFloatHashMap);
        calculatedBasket.setFullSum(fullSum);
        calculatedBasket.setUserAddress(userAddress);
        calculatedBasket.setPaymentEnum(paymentEnum);
        return calculatedBasket;
    }
}

