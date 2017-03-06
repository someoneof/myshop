package com.example.repository;

import com.example.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by 海峰 on 2017/3/6.
 */
@Repository
public interface ProductCrudRepository extends CrudRepository<Product,Long> {

    public abstract Page<Product> findAll(Pageable pageable);
}
