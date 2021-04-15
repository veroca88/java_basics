package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            System.out.println(i);
        }

        /*Create an array of ten byte values.
        The values can be any arbitrary numbers that you choose.
        Now use a for-loop to iterate over the elements
        in the array and print them to the console. */

        byte[] b = {10, 9, 8};
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
