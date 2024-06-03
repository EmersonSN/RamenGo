package org.example.service;

import org.example.client.OrderClient;
import org.example.dto.OrderIdResponse;
import org.example.dto.OrderRequest;
import org.example.dto.OrderResponse;
import org.example.model.Broth;
import org.example.model.Pedido;
import org.example.model.Protein;
import org.example.repository.BrothRepository;
import org.example.repository.OrderRepository;
import org.example.repository.ProteinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BrothRepository brothRepository;

    @Autowired
    private ProteinRepository proteinRepository;


    private final OrderClient orderClient;

    public OrderService(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    public OrderIdResponse generateOrderId() {
        return orderClient.generateOrderId();
    }

    public OrderResponse createOrder(OrderRequest orderRequest) {
        Broth broth = brothRepository.findById(orderRequest.getBrothId()).orElseThrow();
        Protein protein = proteinRepository.findById(orderRequest.getProteinId()).orElseThrow();

        OrderIdResponse orderIdResponse = orderClient.generateOrderId();

        Pedido pedido = new Pedido();
        pedido.setDescription(broth.getName() + " and " + protein.getName() + " Ramen");
        pedido.setImage("https://tech.redventures.com.br/icons/ramen/ramenChasu.png"); // Ajuste conforme necessário

        pedido = orderRepository.save(pedido);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(orderIdResponse.getId());
        orderResponse.setDescription(pedido.getDescription());
        orderResponse.setImage(pedido.getImage());

        return orderResponse;
    }
}
