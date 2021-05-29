package com.online.shop.admin.dao;

import com.online.shop.admin.config.Database;
import com.online.shop.admin.config.MysqlDatabase;
import com.online.shop.admin.entity.Product;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amol.Sarwade
 */
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public int saveProduct(Product product) {

        Database database = new MysqlDatabase();
        Connection connection = database.initDatabase();

        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO product(title, sku, price, quantity) VALUES(?, ?, ?, ?)");

            statement.setString(1, product.getTitle());
            statement.setString(2, product.getSku());
            statement.setBigDecimal(3, product.getPrice());
            statement.setInt(4, product.getQuantity());

            int rowCount = statement.executeUpdate();

            statement.close();
            connection.close();

            return rowCount;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    @Override
    public List<Product> fetchAll() {

        Database database = new MysqlDatabase();
        Connection connection = database.initDatabase();

        List<Product> products = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");

            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                String sku = resultSet.getString("sku");
                BigDecimal price = resultSet.getBigDecimal("price");
                int quantity = resultSet.getInt("quantity");

                Product product = new Product(id, title, sku, price, quantity);

                products.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}
