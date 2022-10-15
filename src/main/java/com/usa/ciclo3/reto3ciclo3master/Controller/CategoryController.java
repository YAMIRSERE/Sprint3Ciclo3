package com.usa.ciclo3.reto3ciclo3master.Controller;


import com.usa.ciclo3.reto3ciclo3master.entities.Category;
import com.usa.ciclo3.reto3ciclo3master.entities.Product;
import com.usa.ciclo3.reto3ciclo3master.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category p){
        return categoryService.save(p);
    }
}
