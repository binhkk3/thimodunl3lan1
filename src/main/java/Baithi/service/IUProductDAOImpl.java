package Baithi.service;

import Baithi.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IUProductDAOImpl implements IUProductDAO {
    public IUProductDAOImpl() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bai_thi?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void add(Product product) throws SQLException {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("Select * from product");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String nameProduct = rs.getString("nameProduct");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String clor = rs.getString("clor");

                String category = rs.getString("category");
                String description = rs.getString(" description");
                products.add(new Product( nameProduct, price,quantity,clor,description,category));
            }
        } catch (SQLException e) {
        }
        return products;
    }
    @Override
    public List<Product> findAllOderByAge() {
        return null;
    }

    @Override
    public List<Product> findAllByName(String key) {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("Select * from customer where name like ?");) {
            System.out.println(preparedStatement);
            preparedStatement.setString(1,"%"+ key +"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String nameProduct = rs.getString("nameProduct");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String clor = rs.getString("clor");

                String category = rs.getString("category");
                String description = rs.getString(" description");
                products.add(new Product( nameProduct, price,quantity,clor,description,category));
            }
        } catch (SQLException e) {
        }
        return products;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Product product) throws SQLException {
        return false;
    }
}
