package com.example.fittrack;

public class Exercise {
    private String name, duration, url;
    public Exercise(String name, String duration, String url){
        this.name=name;
        this.duration=duration;
        this.url=url;
    }
    public String getDuration(){
        return duration;
    }
    public String getName(){
        return name;
    }
    public String getUrl(){
        return url;
    }
}
