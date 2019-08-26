package com.grocery.grocery.controllers;

import com.grocery.grocery.data.GroceryList;
import com.grocery.grocery.services.GroceryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
@CrossOrigin(origins = "http://localhost:4200")
public class GroceryListController {

    @Autowired
    GroceryListService groceryListService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GroceryList> getAll() {return groceryListService.getAll();}

}
