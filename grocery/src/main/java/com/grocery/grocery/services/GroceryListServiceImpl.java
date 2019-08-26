package com.grocery.grocery.services;


import com.grocery.grocery.data.GroceryList;
import com.grocery.grocery.repos.GroceryListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class GroceryListServiceImpl implements GroceryListService {

    @Autowired
    GroceryListRepo groceryListRepo;

    @Override
    public List<GroceryList> getAll() {
        return groceryListRepo.findAll();
    }

    @Override
    public GroceryList update(GroceryList gl) {
        return groceryListRepo.save(gl);
    }

    @Override
    public GroceryList create(GroceryList gl) {
        return groceryListRepo.save(gl);
    }

    @Override
    public void delete(int id) {

    }
}
