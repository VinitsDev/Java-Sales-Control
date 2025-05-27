package br.com.vinicius.Sales_Control.repository;

import br.com.vinicius.Sales_Control.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
