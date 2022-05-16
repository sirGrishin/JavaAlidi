package com.example.feign.client.imp;

import com.example.feign.client.PostFeignClient;
import com.example.feign.model.Basket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PostFeignClientFallback implements PostFeignClient {

    @Override
    public Float calculatePrice(Basket basket) {
        return null;
    }

    @Override
    public Float getPrice(Integer productId) {
        return null;
    }
}
