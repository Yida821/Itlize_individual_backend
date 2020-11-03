package com.example.yichun.controller;

import com.example.yichun.DAO.ProductRepository;
import com.example.yichun.model.Product;
import com.example.yichun.model.User;
import com.example.yichun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3006")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    //find
    @GetMapping("/findProductById/{id}")
    public Product findProductById(@PathVariable(value = "id") int id) {
       return productRepository.findProductById(id);
    }

    @GetMapping("/findProductByCategoryName/{categoryName}")
    public List<Product> findProductByCategoryName(@PathVariable(value = "categoryName") String categoryName) {
        System.out.println("in find products by category");
        return productRepository.findProductByCategoryName(categoryName);
    }

    @GetMapping("/findProductBySubCategoryName/{subCategoryName}")
    public List<Product> findProductBySubCategoryName(@PathVariable(value = "subCategoryName") String subCategoryName) {
        System.out.println("in find products by sub category!");
        return productRepository.findProductBySubCategoryName(subCategoryName);
    }

    @GetMapping("findProductByCategoryNameAndSubCategoryName")
    public List<Product> findProductByCategoryNameAndSubCategoryName(
            @RequestParam("categoryName") String categoryName,
            @RequestParam("subCategoryName") String subCategoryName
    ) {
        System.out.println("in find products by category + sub category!");
        return productRepository.findProductByCategoryNameAndSubCategoryName(categoryName, subCategoryName);
    }

    @GetMapping("/findAllProducts")
    public List<Product> findAllProducts() {
        System.out.println("in find all products!");
        List<Product> products = productRepository.findAll();
        return products;
    }


    @GetMapping("/findDistinctByCategoryName")
    public List<String> findDistinctByCategoryName() {
        System.out.println("in find all unique category name!");
        List<String> uniqueCategoryName = productRepository.findDistinctCategoryName();
        return uniqueCategoryName;
    }

    //delete
    @DeleteMapping("/deleteProductById/{id}")
    public void deleteProductById(@PathVariable(value = "id") int id) {
        productRepository.deleteProductById(id);
    }


}
