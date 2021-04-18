public class MethodParams {
    public static void main(String[] args) {
        MethodParams mp = new MethodParams();

        //call convertIntToDouble()
        double intToDouble = mp.convertIntToDouble(20);
        System.out.println(intToDouble);

        //call sum()
        double multipleSum = mp.sum(1.5, 4, 3);
        System.out.println(multipleSum);

        //call exercise one
        double[] arr = mp.square(1, 2, 3, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //call exercise two
        String isSorted = mp.findFirstWord("window", "apple");
        System.out.println(isSorted);


    }

    //single parameter
    public double convertIntToDouble(int number) {
        return (double)number;
    }

    //multiple parameter
    public double sum(double a, int b, int c) {
        return a + b + c;
    }

    /* Exercise One Create a method that declares four int parameters,
    squares each, and places the results in a float array.
    The method should return the float array result. Name the method square. */

    public double[] square(int a, int b, int c, int d) {
        double[] squareArr = {a*a, b*b, c*c, d*d};
        return squareArr;
    }

    /* Exercise two Create a method that declares two String[] parameters.
    This method should search through each parameter and determine the value
    that should come first if they were sorted alphabetically. Whichever value
    is first from both parameters should be returned. Name the method findFirstLetter. */

    public String findFirstWord(String a, String b) {
        //convert Strings to array for iterating over
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        //loop through letters of each
        for (int i = 0; i < aArray.length; i++) {
            //if letter in a comes before b, then return a
            if (aArray[i] < bArray[i]) { return a; }
            //check if letter in b comes before a
            if (aArray[i] > bArray[i]) { return b; }
            //otherwise they are equal and you can move to the next letter
            }
        //you need this line in case the above loop doesn't return anything.
        // this is for the compiler.
        return a; }


}
