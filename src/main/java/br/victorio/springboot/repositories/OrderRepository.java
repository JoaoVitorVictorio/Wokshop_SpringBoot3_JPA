package br.victorio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.victorio.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
