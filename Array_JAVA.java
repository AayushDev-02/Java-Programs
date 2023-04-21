package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_JAVA {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println('\n');

        //sorting
        int[]arr2 = {32,42,12,3,13,10};
         Arrays.sort(arr2);
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }


        //searching
        int key = 5;
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                index = i;
            }
        }
        if(index!= -1){
            System.out.println("The key is found at index : " + index);
        }else{
            System.out.println("Element not found");
        }


        //min element

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);

        // max element
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The minimum element in the array is: " + max);

    }
}
