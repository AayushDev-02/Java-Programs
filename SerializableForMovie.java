package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableForMovie {
    public static void main(String[] args) throws FileNotFoundException {
        try{

            MoviesSerializable movie = new MoviesSerializable("RRR", "Aayush",9 );

            FileOutputStream fileOut = new FileOutputStream("movie.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(movie);
            out.close();
            System.out.println("Serialized Data is stored in movie.ser");


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
