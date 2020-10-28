package com.example.yichun.controller;

import com.example.yichun.DAO.ProductRepository;
import com.example.yichun.model.Product;
import com.example.yichun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    //find
    @GetMapping("/findProductById")
    public Product findProductById(int id) {
       return productRepository.findProductById(id);
    }

    @DeleteMapping("/deleteProductById")
    public void deleteProductById(int id) {
        productRepository.deleteProductById(id);
    }
}
