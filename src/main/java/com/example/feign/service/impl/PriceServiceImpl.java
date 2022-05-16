package com.example.feign.service.impl;

import com.example.feign.client.PostFeignClient;
import com.example.feign.service.PriceService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Ilya Grishin
 */
@Service
public class PriceServiceImpl implements PriceService {
    private final PostFeignClient postFeignClient;

    public PriceServiceImpl(PostFeignClient postFeignClient) {
        this.postFeignClient = postFeignClient;
    }

    @Override
    @Cacheable("productPrice")
    public Float getPrice(Integer productId) {
       return postFeignClient.getPrice(productId);
    }
}
