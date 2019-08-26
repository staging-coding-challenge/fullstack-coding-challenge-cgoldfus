package com.grocery.grocery.repos;

import com.grocery.grocery.data.GroceryList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroceryListRepo extends JpaRepository<GroceryList, Integer> {
}
