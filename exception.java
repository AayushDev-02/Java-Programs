package com.company;
import java.util.*;
public class exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 100;
        int deno = 0;

        //gives exception
//        System.out.println("The division of num and deno is: " + (num/deno));

        



        try{
            int a = 20;
            int b = 0;

            System.out.println("The division is: " + (a/b));
        }catch (Exception e){
            System.out.println(" The following exception occurred: " + e);
            System.out.println("Cannot divide by 0");
        }

        try{
            int[] arr = {1,2,3,4,5};

            System.out.println(arr[-1]);
        }
        catch (Exception e){
            System.out.println("The following exception occurred" + e.getMessage());
        }
    }
}
