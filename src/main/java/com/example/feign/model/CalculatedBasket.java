package com.example.feign.model;


import com.example.feign.util.PaymentEnum;
import lombok.Data;

import java.util.Map;

/**
 * @author Ilya Grishin
 */
@Data
public class CalculatedBasket {
    Map<Basket,Float> basketMap;
    Float fullSum;
    PaymentEnum paymentEnum;
    String userAddress;

}
