package com.online.shop.admin.controller;

import com.online.shop.admin.entity.Product;
import com.online.shop.admin.service.ProductService;
import com.online.shop.admin.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Amol.Sarwade
 */
@WebServlet(name = "ProductListServlet", urlPatterns = "/product-list")
public class ProductListServlet extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.getProducts();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/pages/product-list.jsp").forward(request, response);
    }
}
