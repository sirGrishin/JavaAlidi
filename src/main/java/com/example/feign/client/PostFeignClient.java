package com.example.feign.client;

import com.example.feign.config.FeignClientConfig;
import com.example.feign.client.imp.PostFeignClientFallback;
import com.example.feign.model.Basket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "postFeignClient", url = "${client.post.baseUrl}",
        configuration = FeignClientConfig.class, fallback = PostFeignClientFallback.class)
public interface PostFeignClient {

    @PostMapping("/calculated-price")
    Float calculatePrice(@RequestBody Basket basket);

    @GetMapping("/getPrice/{id}") ////README 3
    Float getPrice(@PathVariable("id") Integer productId);

}
