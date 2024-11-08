package com.example.fittrack;

import java.util.ArrayList;
import java.util.Arrays;

public class Recommendation {
    private String name;
    private ArrayList<String> workouts, foods;

    public Recommendation(String name, String[] arr, String[] arr2){
        this.name=name;
        this.workouts=new ArrayList<>(Arrays.asList(arr));
        this.foods=new ArrayList<>(Arrays.asList(arr2));
    }

    public String getName(){
        return name;
    }
    public ArrayList<String> getWorkouts(){
        return workouts;
    }
    public ArrayList<String> getFoods(){
        return foods;
    }
}
