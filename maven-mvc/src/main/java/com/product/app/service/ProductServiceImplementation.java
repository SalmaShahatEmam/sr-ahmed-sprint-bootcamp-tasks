package com.product.app.service;

import com.product.app.dao.ProductDao;
import com.product.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService{

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll()
    {
       return this.productDao.findAll();
    }
}
