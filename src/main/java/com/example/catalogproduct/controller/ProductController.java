package com.example.catalogproduct.controller;

import com.example.catalogproduct.model.Product;
import com.example.catalogproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
   @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
      return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method =  RequestMethod.GET)
    public Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }

}
