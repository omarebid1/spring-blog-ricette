package com.example.springblogricette.repository;

import com.example.springblogricette.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {


}
