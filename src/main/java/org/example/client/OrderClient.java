package org.example.client;

import org.example.dto.OrderIdResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "orderClient", url = "https://api.tech.redventures.com.br")
public interface OrderClient {

    @PostMapping(value = "/orders/generate-id", headers = "x-api-key=ZtVdh8XQ2U8pWI2gmZ7f796Vh8GllXoN7mr0djNf")
    OrderIdResponse generateOrderId();
}
