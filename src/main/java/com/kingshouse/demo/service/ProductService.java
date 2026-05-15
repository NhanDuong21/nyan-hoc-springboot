package com.kingshouse.demo.service;

import com.kingshouse.demo.model.dto.request.ProductRequest;
import com.kingshouse.demo.model.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Long id);

    ProductResponse createProduct(ProductRequest request);

    ProductResponse updateProduct(Long id, ProductRequest request);

    void deleteProduct(Long id);

    List<ProductResponse> searchProducts(String keyword);
}