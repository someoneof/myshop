package com.example;

import com.example.domain.Product;
import com.example.domain.Vendor;
import com.example.service.ProductService;
import com.example.service.VendorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyshopApplicationTests {

	@Autowired
	private VendorService vendorService;


	@Autowired
	private ProductService productService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void save(){
		Product product=new Product();
		product.setProductName("lala");
		product.setProductPrice(11f);
		productService.addProduct(product);
	}

	@Test
	public void saveVendor(){
		Vendor vendor=new Vendor();
		vendor.setVerName("xxx");
		vendor.setVerCountry("meiguo");
		vendor.setVerAddress("sisls");
		vendorService.addVendor(vendor);
	}

}
