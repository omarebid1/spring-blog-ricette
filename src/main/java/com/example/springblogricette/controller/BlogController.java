package com.example.springblogricette.controller;

import com.example.springblogricette.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipe")
public class BlogController {

    @Autowired
    private RecipeRepository recipeRepository;


}
