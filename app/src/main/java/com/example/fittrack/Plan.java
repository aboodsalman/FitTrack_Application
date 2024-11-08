package com.example.fittrack;

import java.util.ArrayList;
import java.util.Arrays;

public class Plan {
    private String name, desc;
    private int imgID, duration;
    private ArrayList<Exercise> exercises;

    public Plan(String name, String desc, int imgID, int duration, Exercise arr[]){
        this.name=name;
        this.desc=desc;
        this.imgID=imgID;
        this.duration=duration;
        exercises= new ArrayList<>(Arrays.asList(arr));
    }
    public ArrayList<Exercise> getExercises(){
        return exercises;
    }
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public int getImgID(){
        return imgID;
    }
    public int getDuration(){
        return duration;
    }

}
