package br.com.vinicius.Sales_Control.repository;

import br.com.vinicius.Sales_Control.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
