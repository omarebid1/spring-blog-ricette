package com.example.springblogricette.model;


import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
@Table(name = "recipe")

public class Recipe {

    //ATTRIBUTI
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private ArrayList<String> ingredients;
    private String url;
    private int preparingTime;
    private int portions;
    private String description;


    //COSTRUTTORI
    public Recipe(int id, String title, ArrayList<String> ingredients, String url, int preparingTime, int portions, String description) {
        this.id = id;
        this.title = title;
        this.ingredients = ingredients;
        this.url = url;
        this.preparingTime = preparingTime;
        this.portions = portions;
        this.description = description;
    }

    public Recipe() {
    }


    //SETTERS & GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPreparingTime() {
        return preparingTime;
    }

    public void setPreparingTime(int preparingTime) {
        this.preparingTime = preparingTime;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //METODI


}
