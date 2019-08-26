package com.grocery.grocery.services;

import com.grocery.grocery.data.GroceryItem;
import com.grocery.grocery.repos.GroceryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class GrocerItemServiceImpl implements GroceryItemService {

    @Autowired
    GroceryItemRepo groceryItemRepo;

    @Override
    public List<GroceryItem> getAll() {
        return groceryItemRepo.findAll();
    }

    @Override
    public GroceryItem update(GroceryItem gi) {
        return null;
    }

    @Override
    public GroceryItem create(GroceryItem gi) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
