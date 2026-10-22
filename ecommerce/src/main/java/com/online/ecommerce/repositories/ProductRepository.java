package com.online.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.ecommerce.schema.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
