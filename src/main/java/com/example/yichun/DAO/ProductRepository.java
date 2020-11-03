package com.example.yichun.DAO;

import com.example.yichun.model.Product;
import com.example.yichun.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findProductById(int id);

    List<Product> findProductByCategoryName(String categoryName);

    List<Product> findProductBySubCategoryName(String subCategoryName);

    List<Product> findProductByCategoryNameAndSubCategoryName (String categoryName, String subCategoryName);

    @Transactional
    void deleteProductById(int id);

    List<Product> findAll();

//    List<String> findDistinctByCategoryName();

//    List<String> findDistinctByCategoryName(String name);

    @Query(value =  "SELECT DISTINCT p.category_name FROM Product p", nativeQuery = true)
    List<String> findDistinctCategoryName();



}
