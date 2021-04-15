package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean on = true;

        while(on) {
            System.out.println("Inside the while loop");
            on = false;
        }

        int number = 10;

        while(number >= -10) {
            if (number%2 ==0) {
                System.out.println(number);
            }
            number--;
        }
    }
}
