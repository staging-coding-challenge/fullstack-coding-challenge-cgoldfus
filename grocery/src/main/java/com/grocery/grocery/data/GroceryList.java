package com.grocery.grocery.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name="grocery_lists")
public class GroceryList {

    @Id
    @GeneratedValue
    @Column(name="grocery_list_id")
    private int id;

    @Column(name="grocery_list_description")
    private String description;

//    @OneToMany(targetEntity = GroceryItem.class, mappedBy = "grocery_lists")
//    @JsonIgnore
//    private List<GroceryItem> groceryItems = new ArrayList<GroceryItem>();
//
//    public List<GroceryItem> getGroceryItems() {
//        return groceryItems;
//    }
//
//    public void setGroceryItems(List<GroceryItem> groceryItems) {
//        this.groceryItems = groceryItems;
//    }

    public GroceryList() {super();}

    public GroceryList(int id, String description) {
        this.description = description;
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
}
