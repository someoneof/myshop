package com.example;

import com.example.domain.Vendor;
import com.example.service.VendorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 海峰 on 2017/3/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorTest {

    @Autowired
    private VendorService vendorService;

    @Test
    public void save(){
        Vendor vendor=new Vendor();
        vendor.setVerName("xxxxxx");
        vendor.setVerCountry("meiguo");
        vendor.setVerAddress("sisls");
        vendorService.addVendor(vendor);
    }
}
