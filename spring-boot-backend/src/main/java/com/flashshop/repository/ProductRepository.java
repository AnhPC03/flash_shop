package com.flashshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flashshop.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
