package com.javademos.ProductSpringHomework.repository;

import com.javademos.ProductSpringHomework.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository  extends JpaRepository<Product,Integer> {
}
