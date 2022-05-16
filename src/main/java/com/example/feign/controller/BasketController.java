package com.example.feign.controller;

import com.example.feign.model.Basket;
import com.example.feign.model.CalculatedBasket;
import com.example.feign.service.CalculatedBasketService;
import com.example.feign.util.PaymentEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilya Grishin
 */
@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor
public class BasketController {

    private final CalculatedBasketService calculatedBasketService;


    @PostMapping
    public ResponseEntity<CalculatedBasket> calculateBasket(@RequestParam Basket[] baskets,
                                                            @RequestParam PaymentEnum paymentEnum,
                                                            @RequestParam String userAddress) { //Readme 1 пункт
        return ResponseEntity.ok().body(calculatedBasketService.calculate(baskets, paymentEnum, userAddress));
    }
}
