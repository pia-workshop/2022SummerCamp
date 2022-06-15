package com.yeditepe.summercamp.piacamp.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yeditepe.summercamp.piacamp.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,UUID> {

	Product findByCode(String productCode);
		
}
