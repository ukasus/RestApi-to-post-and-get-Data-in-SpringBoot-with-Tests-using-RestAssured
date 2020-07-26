package com.applicatieaiproject.ujjawal.internproject.Repositories;

import com.applicatieaiproject.ujjawal.internproject.Entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
