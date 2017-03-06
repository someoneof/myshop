package com.example.repository;

import com.example.domain.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 海峰 on 2017/3/6.
 */
@Repository
public interface VendorCrudRepository extends CrudRepository<Vendor,Long>{


}
