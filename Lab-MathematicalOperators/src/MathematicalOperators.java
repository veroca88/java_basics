public class MathematicalOperators {
    public static void main(String[] args) {
//define variables
        int x = 5;
        int y = 3;
        int z;


//simple addition
        z = x + y;
        System.out.println(z);

//simple subtraction

        z = x - y;
        System.out.println(z);

//simple multiplication

        z = x * y;
        System.out.println(z);

//simple division
        z= x / y;
        System.out.println(z);

//simple modulus
        z = x % y;
        System.out.println(z);

//float vs. int
        float f = 3.6f;
        int i = 22;
// With (int) next to f - > Essentially, you're rounding the result to the nearest whole number.
        int result = (int)f + i;
        System.out.println(result);

//double can support the precision of the sum of an int and a float.
        double resultDouble = f + i;
        System.out.println(resultDouble);

    }
}
