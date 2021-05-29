package com.online.shop.admin.dao;

import com.online.shop.admin.entity.Product;

import java.util.List;

/**
 * @author Amol.Sarwade
 */
public interface ProductRepository {

    int saveProduct(Product product);

    List<Product> fetchAll();
}
