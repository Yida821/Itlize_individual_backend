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

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteProductById(id);
    }

    @Override
    public List<Product> findProductByCategoryName(String categoryName) {
        return productRepository.findProductByCategoryName(categoryName);
    }

    @Override
    public List<Product> findProductBySubCategoryName(String subCategoryName) {
        return productRepository.findProductBySubCategoryName(subCategoryName);
    }

    @Override
    public List<Product> findProductByCategoryNameAndSubCategoryName (String categoryName, String subCategoryName) {
        return productRepository.findProductByCategoryNameAndSubCategoryName(categoryName,subCategoryName);
    }

//    @Override
//    public List<String> findDistinctByCategoryName() {
//        return productRepository.findDistinctByCategoryName();
//    }




}
