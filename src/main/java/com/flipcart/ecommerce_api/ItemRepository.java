package com.flipcart.ecommerce_api;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Item entity
 * Spring Data JPA will automatically implement this interface
 * Provides basic CRUD operations: save(), findById(), findAll(), delete()
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
