package com.company;

public class Main {

    public static void main(String[] args) {
	/* We need to apply code for an 	automatic sprinkler system that will spray a specified amount of liters of water
	based on the chance of rain according to the following table:
	Chance of Rain (%)	Water Output (L)
	0 - 19              30
	20 - 30             10
	31 - 55             0
	56 - 100            0
	If we needed to design a program to take in this information and output the necessary water level
	then we could write something like the following: */

        int precipitation = 0;
        int outputWater = 0;

        if (precipitation < 20) {
            outputWater = 30;
        } else if (precipitation > 31) {
            outputWater = 10;
        } else if (precipitation < 56) {
            outputWater = 0;
        }
        else {
            outputWater = 0;
        }
        System.out.println("The water output should be " + outputWater);
    }
}
