package com.GestionInventario.v1.controller;

import com.GestionInventario.v1.model.Product;
import com.GestionInventario.v1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getByid(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.save(product);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product uProduct = productService.findById(id);
        if (uProduct != null){
            uProduct.setId(product.getId());
            uProduct.setName(product.getName());
            uProduct.setPrice(product.getPrice());
            uProduct.setDescription(product.getDescription());
            return productService.save(uProduct);
        }else {
            return null;
        }
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.delete(id);
    }
}
