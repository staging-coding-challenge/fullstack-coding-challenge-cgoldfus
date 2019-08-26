package com.grocery.grocery.controllers;

import com.grocery.grocery.data.GroceryItem;
import com.grocery.grocery.services.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/items")
public class GroceryItemController {

    @Autowired
    GroceryItemService groceryItemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GroceryItem> getAll() {return groceryItemService.getAll();}
}
