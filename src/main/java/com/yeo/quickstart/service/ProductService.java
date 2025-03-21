package com.yeo.quickstart.service;

import com.yeo.quickstart.model.Product;
import com.yeo.quickstart.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    List<Product> products = new ArrayList<>();

//    public ProductService() {
//        products.add(new Product(101, "Iphone", 1000));
//        products.add(new Product(102, "Ipad", 2000));
//        products.add(new Product(103, "Ipod", 500));
//    }

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
