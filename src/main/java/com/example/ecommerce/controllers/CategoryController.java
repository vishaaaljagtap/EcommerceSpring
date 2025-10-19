package com.example.ecommerce.controllers;

import com.example.ecommerce.services.CategoryService;
import com.example.ecommerce.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String getAllCategories(){
        return "Categories";
    }
}
