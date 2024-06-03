package org.example.repository;

import org.example.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Pedido, Long> {
}
