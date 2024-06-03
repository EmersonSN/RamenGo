package org.example.controller;

import org.example.dto.OrderRequest;
import org.example.dto.OrderResponse;
import org.example.model.Broth;
import org.example.model.Protein;
import org.example.service.BrothService;
import org.example.service.OrderService;
import org.example.service.ProteinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RamenController {

    @Autowired
    private BrothService brothService;

    @Autowired
    private ProteinService proteinService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/broths")
    public List<Broth> getAllBroths() {
        return brothService.getAllBroths();
    }

    @GetMapping("/proteins")
    public List<Protein> getAllProteins() {
        return proteinService.getAllProteins();
    }

    @PostMapping("/orders")
    public OrderResponse createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.createOrder(orderRequest);
    }
}
