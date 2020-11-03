package com.example.yichun.service;

import com.example.yichun.model.Product;

import java.util.List;

public interface ProductService {
    Product findProductById(int id);

    List<Product> findProductByCategoryName(String categoryName);

    List<Product> findProductBySubCategoryName(String subCategoryName);

    List<Product> findProductByCategoryNameAndSubCategoryName (String categoryName, String subCategoryName);

    void deleteProductById(int id);

    List<Product> findAll();

//    List<String> findDistinctByCategoryName();
}
