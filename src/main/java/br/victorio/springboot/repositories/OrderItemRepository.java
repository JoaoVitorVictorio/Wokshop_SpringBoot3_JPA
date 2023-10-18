package br.victorio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.victorio.springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
