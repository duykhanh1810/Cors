package com.example.Cors.controller;

import com.example.Cors.model.Coffee;
import com.example.Cors.model.Size;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
//@CrossOrigin(origins = "http://localhost:8080") //c1
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    private CoffeeController(){
        coffeeList.add(new Coffee(1,"Capuchino", Size.L));
        coffeeList.add(new Coffee(2,"Latte",Size.Xl));
        coffeeList.add(new Coffee(3,"Egg milk",Size.M));
    }

    @GetMapping
    public List<Coffee> getAll(){
        return coffeeList;
    }

    @DeleteMapping
    public void delete(int id){
        coffeeList.removeIf(c->c.id().equals(id));
    }
}
