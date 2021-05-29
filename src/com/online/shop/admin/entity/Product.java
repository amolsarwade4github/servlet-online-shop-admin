package com.online.shop.admin.entity;

import java.math.BigDecimal;

/**
 * @author Amol.Sarwade
 */
public class Product {
    private Long id;
    private String title;
    private String sku;
    private BigDecimal price;
    private int quantity;

    public Product(Long id, String title, String sku, BigDecimal price, int quantity) {
        this.id = id;
        this.title = title;
        this.sku = sku;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String title, String sku, BigDecimal price, int quantity) {
        this.title = title;
        this.sku = sku;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
