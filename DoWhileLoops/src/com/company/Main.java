package com.company;

public class Main {

    public static void main(String[] args) {
        boolean on = false;
        do {
            System.out.println("Inside the do-while loop");
        } while(on);

       /* Exercise1: write a do-while loop that prints the
        odd numbers 1 through 49, inclusively, each on a separate line.*/

        int oddNumber = 1;
        do {
            if(oddNumber%2 != 0) {
                System.out.println(oddNumber);
            }
            oddNumber++;
        } while(oddNumber < 50);

        /* write a do-while loop that prints the letters of the alphabet.
        You must use a single char variable that you manipulate to print to the console.
        (You should not have 26 lines of code that each print a letter...) */

        char letter = 'a';
        char end = 'z';

        do{
            System.out.println(letter);
            letter++;
        } while(letter <= end);

    }
}
