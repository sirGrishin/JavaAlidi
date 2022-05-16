package com.example.feign.model;

import com.example.feign.util.PaymentEnum;
import lombok.Data;

/**
 * @author Ilya Grishin
 */
@Data
public class Basket {
    Integer productId;
    Integer count;
}
