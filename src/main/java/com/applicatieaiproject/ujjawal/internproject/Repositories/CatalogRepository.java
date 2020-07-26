package com.applicatieaiproject.ujjawal.internproject.Repositories;

import com.applicatieaiproject.ujjawal.internproject.Entities.Catalog;
import com.applicatieaiproject.ujjawal.internproject.Entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Integer> {

    public Catalog findBySupplier(Supplier supplier);
}
