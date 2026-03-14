package com.kshtriya.PoductManagementBackend.controller;

import com.kshtriya.PoductManagementBackend.model.Product;
import com.kshtriya.PoductManagementBackend.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // Save Product
    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    // Get All Products
    @GetMapping("/")
    public ResponseEntity<?> getAllProduct() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    // Get Product By Id
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id) {
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    // Delete Product
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product Deleted Successfully", HttpStatus.OK);
    }

    // Update Product
    @PutMapping("/editProduct/{id}")
    public ResponseEntity<?> editProduct(@RequestBody Product product,@PathVariable Integer id) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.OK);
    }
}