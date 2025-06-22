package br.com.thiago.spring_example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {

    
}  

