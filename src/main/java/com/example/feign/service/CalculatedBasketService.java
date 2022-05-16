package com.example.feign.service;

import com.example.feign.model.Basket;
import com.example.feign.model.CalculatedBasket;
import com.example.feign.util.PaymentEnum;

/**
 * @author Ilya Grishin
 */
public interface CalculatedBasketService {

    CalculatedBasket calculate(Basket[] baskets, PaymentEnum paymentEnum, String userAddress);
}
