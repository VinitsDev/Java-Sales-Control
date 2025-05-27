package br.com.vinicius.Sales_Control.repository;

import br.com.vinicius.Sales_Control.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
