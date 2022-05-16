package com.example.feign.service;

/**
 * @author Ilya Grishin
 */
public interface PriceService {

    Float getPrice(Integer productId);
}
