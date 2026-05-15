package com.kingshouse.demo.model.dto.request;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

import org.antlr.v4.runtime.misc.NotNull;

public class ProductRequest {

    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String name;

    private String description;

    @NotNull()
    @DecimalMin(value = "0.0", inclusive = false, message = "Giá phải lớn hơn 0")
    private BigDecimal price;

    @NotNull()
    @Min(value = 0, message = "Số lượng tồn kho không được âm")
    private Integer stock;

    private String imageUrl;

    public ProductRequest() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}