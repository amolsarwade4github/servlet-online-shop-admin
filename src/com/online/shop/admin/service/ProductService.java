package com.online.shop.admin.service;

import com.online.shop.admin.entity.Product;

import java.util.List;

/**
 * @author Amol.Sarwade
 */
public interface ProductService {

    int addProduct(Product product);

    List<Product> getProducts();
}
