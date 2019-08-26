package com.grocery.grocery.services;

import com.grocery.grocery.data.GroceryList;

import java.util.List;

public interface GroceryListService {

    List<GroceryList> getAll();
    GroceryList update(GroceryList gl);
    GroceryList create(GroceryList gl);
    void delete(int id);
}
