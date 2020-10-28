package com.example.yichun.service.impl;


import com.example.yichun.DAO.ProductRepository;
import com.example.yichun.model.Product;
import com.example.yichun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product findProductById(int id) {
        return productRepository.findProductById(id);
    }

//    @Override
//    public List<Product> findAllProducts() {
//        return productRepository.findAllProducts();
//    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteProductById(id);
    }

//    @Override
//    public Product saveProduct(Product product) {
//        return productRepository.saveProduct(product);
//    }
//
//    @Override
//    public  Product updateProduct(Product product) {
//        return productRepository.updateProduct(product);
//    }

}
