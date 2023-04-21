package com.company;

import java.io.Serializable;

public class MoviesSerializable implements Serializable {
    private String movieName;
    private int rating;
    private String dName;

    MoviesSerializable(String name, String director, int rating){
        this.dName = director;
        this.movieName = name;
        this.rating = rating;
    }

    public String showDetails(){
        System.out.println("Movie Name: " + movieName + " Rating: " + rating + " Director: " + dName);
        return movieName;
    }
}
