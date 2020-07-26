package com.applicatieaiproject.ujjawal.internproject.Controller;

import com.applicatieaiproject.ujjawal.internproject.Dto.CatalogCreateRequest;
import com.applicatieaiproject.ujjawal.internproject.Entities.Catalog;
import com.applicatieaiproject.ujjawal.internproject.Entities.Supplier;
import com.applicatieaiproject.ujjawal.internproject.Repositories.CatalogRepository;
import com.applicatieaiproject.ujjawal.internproject.Repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class RestControllerClass {
    @Autowired
    CatalogRepository catalogRepository;
    @Autowired
    SupplierRepository supplierRepository;

    @PostMapping("/catalog")
    public String addCatalog(@RequestBody CatalogCreateRequest c)
    {
        Catalog ca=new Catalog();
        ca.setSkuCode(c.getSkuCode());
        ca.setSkuName(c.getSkuName());
        ca.setSkuDescription(c.getSkuDescription());
        ca.setBrandName(c.getBrandName());
        ca.setBrandDescription(c.getBrandDescription());
        ca.setSupplier(supplierRepository.getOne(c.getSupplierId()));
        catalogRepository.save(ca);
        return "Catalog saved";
    }

    @PostMapping("/supplier")
    public String addSupplier(@RequestBody Supplier s)
    {
        supplierRepository.save(s);
        return "Supplier saved";
    }

    @GetMapping(value = "/catalogs/{id}")

    public Object getSKUname(@PathVariable("id") int supplierId)
    {

         Supplier s=supplierRepository.getOne(supplierId);

        Catalog c=catalogRepository.findBySupplier(s);
        HashMap<String,String> res=new HashMap<>();
        res.put("skuName",c.getSkuName());
        return res;
    }


}
