package com.javademos.ProductSpringHomework.controller;

import com.javademos.ProductSpringHomework.entity.Product;
import com.javademos.ProductSpringHomework.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //api sınıfı olması için işaretle
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductRepository iProductRepository;

    //o	@GetMapping("/products") → Tüm ürünleri getir
    @GetMapping
    public List<Product> getAllProducts(){
        return iProductRepository.findAll();
    }
    //@GetMapping("/products/{id}") → Belirli ürünü getir
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return iProductRepository.findById(id);
    }
    //@PostMapping("/products") → Yeni ürün ekle
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return iProductRepository.save(product);
    }

    //@PutMapping("/products/{id}") → Ürün güncelle
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        return iProductRepository.findById(id)
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setPrice(updatedProduct.getPrice());
                    product.setStock(updatedProduct.getStock());
                    return iProductRepository.save(product);
                }).orElseThrow(() -> new RuntimeException("Product not found"));
    }
    // 5. Ürün sil
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        iProductRepository.deleteById(id);
    }


}
