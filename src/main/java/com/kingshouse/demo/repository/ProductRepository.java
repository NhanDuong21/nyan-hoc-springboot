package com.kingshouse.demo.repository;

import com.kingshouse.demo.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findBySlug(String slug);

    boolean existsBySlug(String slug);

    List<Product> findByActiveTrue();

    List<Product> findByNameContainingIgnoreCase(String keyword);
}