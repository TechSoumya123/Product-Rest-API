package com.api.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.product.POJO.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
