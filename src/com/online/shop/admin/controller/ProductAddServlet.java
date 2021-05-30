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
import java.math.BigDecimal;

/**
 * @author Amol.Sarwade
 */
@WebServlet(name = "ProductAddServlet", urlPatterns = "/product-add")
public class ProductAddServlet extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String title = request.getParameter("title");
        final String sku = request.getParameter("sku");
        final BigDecimal price = new BigDecimal(request.getParameter("price"));
        final int quantity = Integer.parseInt(request.getParameter("quantity"));

        Product product = new Product(title, sku, price, quantity);

        int rowCount = productService.addProduct(product);

        if(rowCount > 0) {
            request.setAttribute("productAdded", true);
            response.sendRedirect("/admin/product-list");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pages/product-add.jsp").forward(request, response);
    }
}
