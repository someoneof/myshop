package com.example.service;

import com.example.domain.Product;
import org.springframework.data.domain.Page;

/**
 * Created by 海峰 on 2017/3/6.
 */
public interface ProductService {

    public void addProduct(Product product);

    public void deleteProduct(Product product);

    public void updateProduct(Product product);

    public Product findProduct(Long id);

    public Page<Product> findByPage(int pageNum,int pageSize);
}
