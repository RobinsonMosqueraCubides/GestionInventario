package com.GestionInventario.v1.service;

import com.GestionInventario.v1.model.Product;
import com.GestionInventario.v1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(Long id){
        return productRepository.findById(id).orElse(null);
    }
    public Product save(Product product){
        return productRepository.save(product);
    }
    public void delete(Long id){
        productRepository.deleteById(id);
    }
    public Product update(Long id, Product product){
        Product uProduct = productRepository.findById(id).orElseThrow();
        uProduct.setId(product.getId());
        uProduct.setName(product.getName());
        uProduct.setPrice(product.getPrice());
        uProduct.setDescription(product.getDescription());
        return productRepository.save(uProduct);
    }
}
