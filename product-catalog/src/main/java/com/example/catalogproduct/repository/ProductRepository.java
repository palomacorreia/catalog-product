package com.example.catalogproduct.repository;

import com.example.catalogproduct.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {


}
