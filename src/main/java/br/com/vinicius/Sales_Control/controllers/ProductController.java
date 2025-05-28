package br.com.vinicius.Sales_Control.controllers;

import br.com.vinicius.Sales_Control.entities.Client;
import br.com.vinicius.Sales_Control.entities.Product;
import br.com.vinicius.Sales_Control.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @Operation(summary = "Create a new product")
    public List<Product> create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    @Operation(summary = "Returns a list with all products")
    public List<Product> list(){
        return productService.list();
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Delete a product by Id")
    public List<Product> delete(@PathVariable("id") Long id){
        return productService.delete(id);
    }
}
