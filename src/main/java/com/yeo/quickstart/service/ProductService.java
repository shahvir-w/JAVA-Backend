package com.yeo.quickstart.service;

import com.yeo.quickstart.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(101, "Iphone", 1000));
        products.add(new Product(102, "Ipad", 2000));
        products.add(new Product(103, "Ipod", 500));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        // Iterate over the list to find the product by its ID
        for (Product product : products) {
            if (product.getProdId() == prodId) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product prod) {
        System.out.println(prod);
        products.add(prod);
    }
}
