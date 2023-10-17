package br.victorio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.victorio.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
