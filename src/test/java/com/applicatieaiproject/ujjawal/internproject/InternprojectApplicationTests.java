package com.applicatieaiproject.ujjawal.internproject;


import com.applicatieaiproject.ujjawal.internproject.Repositories.CatalogRepository;
import com.applicatieaiproject.ujjawal.internproject.Repositories.SupplierRepository;
import io.restassured.RestAssured;


import org.junit.Before;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;


import javax.transaction.Transactional;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class InternprojectApplicationTests {
	@Autowired
	 CatalogRepository catalogRepository;
	@Autowired
	 SupplierRepository supplierRepository;

	@LocalServerPort
	private int port;

	@Before
	public void setUp() throws Exception {
		RestAssured.port = port;
	}

	@Test
	@Transactional
	public void testPostSupplier() throws InterruptedException {
		Map<String,String> supplier = new HashMap<>();
		supplier.put("supplierId", "12");
		supplier.put("supplierName", "Ujjawal");

		given().port(port)
				.contentType("application/json")
				.body(supplier)
				.when().post("/supplier").then()
				.statusCode(200);

	}

	@Test
	@Transactional
	public void testPostCatalog() throws InterruptedException {
		Map<String,String> catalog = new HashMap<>();
		catalog.put("skuCode", "11");
		catalog.put("skuName", "12Ujjawal");
		catalog.put("skuDescription","Description");
		catalog.put("brandName","Temp");
		catalog.put("brandDescription","BrandDescription");
		catalog.put("supplierId","12");

		given().port(port)
				.contentType("application/json")
				.body(catalog)
				.when().post("/catalog").then()
				.statusCode(200);

	}


	@Test
	@Transactional

	public void getskuName() throws InterruptedException {

		given().port(port).when().get("/catalogs/12").then().
				assertThat().statusCode(200).body("skuName",equalTo("12Ujjawal"));

	}

}
