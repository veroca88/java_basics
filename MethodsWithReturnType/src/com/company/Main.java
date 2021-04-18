package com.company;

public class Main {

    public static void main(String[] args) {
	/* Because the method stringReturner returns a value we can store that value
       in a variable an use it later */
        String value = stringReturner();
        System.out.println(value);
    }

    public static String stringReturner() {
        return "Hello";
    }
    /* If your method specifies a void return type,
    then you don’t need to use the return keyword.
    May be a situation you want to return early to achieve
    that you have to type return; */


}
