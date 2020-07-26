Run the application as SpringBootApplication or Run with Main Class InterprojectApplication.java at "\src\main\java\com\applicatieaiproject\ujjawal\internproject".

Now to post the Catalog and Supplier json data to rest api send the Post request to "http://localhost:8080/catalog" and "http://localhost:8080/supplier" respectively with respective json data.

To fetch the skuName from Catalog using Supplier ID send get request to "http://localhost:8080/catalogs/supplierId",where supplierId is the id of the supplier to be searched of Integer type.

And to test the api's all rest endpoints,Run the InternprojectApplicationTests.java file at location "\src\test\java\com\applicatieaiproject\ujjawal\internproject".