package com.grocery.grocery.repos;

import com.grocery.grocery.data.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Integer> {
}
