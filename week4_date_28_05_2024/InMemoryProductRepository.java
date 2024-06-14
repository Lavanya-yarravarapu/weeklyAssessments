package com.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProduct(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        Product existingProduct = getProduct(product.getId());
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
        }
    }

    @Override
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
