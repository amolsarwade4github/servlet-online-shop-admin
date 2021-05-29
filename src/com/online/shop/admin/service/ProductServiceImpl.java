package com.online.shop.admin.service;

import com.online.shop.admin.dao.ProductRepository;
import com.online.shop.admin.dao.ProductRepositoryImpl;
import com.online.shop.admin.entity.Product;

import java.util.List;

/**
 * @author Amol.Sarwade
 */
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public int addProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.fetchAll();
    }
}
