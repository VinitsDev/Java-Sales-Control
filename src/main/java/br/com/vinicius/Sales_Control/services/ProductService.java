package br.com.vinicius.Sales_Control.services;

import br.com.vinicius.Sales_Control.entities.Product;
import br.com.vinicius.Sales_Control.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> create(Product product){
        product.setProductId(null);
        productRepository.save(product);
        return list();
    }

    public List<Product> delete (Long id){
        productRepository.deleteById(id);
        return list();
    }

    public List<Product> list (){
        return productRepository.findAll(Sort.by("cost").descending());
    }
}
