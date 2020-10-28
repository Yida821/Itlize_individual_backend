package com.example.yichun.DAO;

import com.example.yichun.model.Product;
import com.example.yichun.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findProductById(int id);


    @Transactional
    void deleteProductById(int id);

    List<Product> findAlL();

}
