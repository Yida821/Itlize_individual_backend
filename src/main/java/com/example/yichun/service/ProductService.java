package com.example.yichun.service;

import com.example.yichun.model.Product;

import java.util.List;

public interface ProductService {
    Product findProductById(int id);
//    List<Product> findAllProducts();

    void deleteProductById(int id);
//
//    Product saveProduct(Product product);
//
//    Product updateProduct(Product product);
}
