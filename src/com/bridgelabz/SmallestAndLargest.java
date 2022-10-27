package com.bridgelabz;

import java.util.Arrays;

public class SmallestAndLargest {
    public static void main(String[] args) {

        int [] array = {94,6,9,46,86,57};

        String s1 = "jhuyg";

        Arrays.sort(array);

        System.out.println("The smallest array is " + array[0]);
        System.out.println("Largest array is " + array[array.length - 1]);
    }
}
