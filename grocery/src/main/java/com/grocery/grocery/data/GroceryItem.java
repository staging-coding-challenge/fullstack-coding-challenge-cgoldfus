package com.grocery.grocery.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.*;

@Component
@Entity
@Table(name="grocery_items")
public class GroceryItem {

    @Id
    @GeneratedValue
    @Column(name = "grocery_item_id")
    private int id;

    @Column(name = "grocery_item_description")
    private String description;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "item_category")
//    Category category;

    @ManyToOne(targetEntity = GroceryList.class)
//    @JsonIgnore
    @JoinColumn(name = "grocery_list_id")
    private int groceryListId;

    GroceryItem() {
        super();
    }

    public int getGroceryListId() {
        return groceryListId;
    }

    public void setGroceryListId(int groceryListId) {
        this.groceryListId = groceryListId;
    }

    public GroceryItem(int id, String description, Category category, int groceryListId) {
        this.id = id;
        this.description = description;
        this.groceryListId = groceryListId;
//        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}