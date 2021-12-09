package Baithi.service;

import Baithi.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IUProductDAO {
    public void add(Product product) throws SQLException;

    public Product findById(int id);

    public List<Product > findAll();
    public List<Product> findAllOderByAge();
    public List<Product> findAllByName(String key);

    public boolean delete(int id) throws SQLException;

    public boolean update(Product product) throws SQLException;
}
