package com.product.app.dao;

import com.product.app.model.Product;
import com.product.app.model.ProductDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class productDaoImp implements ProductDao{

    SessionFactory sessionFactory ;
    Session session;
    public productDaoImp()
    {
        try{
            this.sessionFactory = new Configuration().configure().buildSessionFactory();
            this.session = sessionFactory.openSession();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    @Override
    public List<Product> findAll()
    {
        Transaction transaction =this.session.beginTransaction();

        List<Product> products =   this.session.createQuery("from Product", Product.class).list();

        transaction.commit();

        return products;
    }

    @Override
    public Product findById(int id)
    {
        Product product = null;

        Transaction transaction = this.session.beginTransaction();
        try{
             product = this.session.get(Product.class  , id);

        }catch(Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        return product;
    }

    @Override
    public Boolean delete(int id){
        Product product = null;

        Transaction transaction =  this.session.beginTransaction();
        try{
             product = this.session.get(Product.class  , id);
             if(product != null)
             {
                 this.session.delete(product);
             }
             transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    public Product save(Product product ){
        Transaction transaction =  this.session.beginTransaction();
        try{
            this.session.save(product);

            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }

        return product;
    }

    public Product update(Product product , int id){
        Transaction transaction =  this.session.beginTransaction();
        try{

            Product product_original = this.session.get(Product.class, id);
            product_original.setDetails(product.getDetails());
            product_original.setName(product.getName());// Update class
            this.session.saveOrUpdate(product_original);

            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }

        return product;
    }
}
