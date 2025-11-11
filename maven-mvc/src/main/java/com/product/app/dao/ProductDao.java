package com.product.app.dao;

import com.product.app.model.Product;
import com.product.app.model.ProductDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductDao {

    public List<Product> findAll();
    public Product findById(int id);
    public Boolean delete(int id);
    public Product save(Product product );
    public Product update(Product product , int id);

}
