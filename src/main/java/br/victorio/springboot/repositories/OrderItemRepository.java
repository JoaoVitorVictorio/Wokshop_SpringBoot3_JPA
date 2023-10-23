package br.victorio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.victorio.springboot.entities.OrderItem;
import br.victorio.springboot.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
