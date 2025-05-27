package br.com.vinicius.Sales_Control.repository;

import br.com.vinicius.Sales_Control.entities.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionItemRepository extends JpaRepository<TransactionItem, Long> {
}
