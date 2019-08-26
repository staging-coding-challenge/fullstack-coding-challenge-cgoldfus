package com.grocery.grocery.services;

import com.grocery.grocery.data.GroceryItem;

import java.util.List;

public interface GroceryItemService {

    List<GroceryItem> getAll();
    GroceryItem update(GroceryItem gi);
    GroceryItem create(GroceryItem gi);
    void delete (int id);
}
