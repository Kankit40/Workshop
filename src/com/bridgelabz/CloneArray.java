package com.bridgelabz;

public class CloneArray {

    public static void main(String[] args) {
        int [] array1 = { };
        int [] array2 = new int[array1.length];

        array2 = array1;


        for (int i = 0; i<array1.length; i++){

            array1 [i] = array2 [i];
        }

        for (int j = 0; j<array2.length; j++){
            System.out.println("Elements of second array is " + array2 [j]);
        }
    }
}
