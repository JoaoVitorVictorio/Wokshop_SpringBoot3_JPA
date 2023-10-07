package br.victorio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.victorio.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
