package br.victorio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.victorio.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
