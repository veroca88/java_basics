import java.util.Arrays;

public class Example {
    public static void main(String[] args){

        //initial values

        int i = 200;

        //cast to a short

        short s = (short)i;
        System.out.println(s);

        //cast to a double

        double d = (double)i;
        System.out.println(d);

        //cast to a byte

        byte b = (byte)i;
        System.out.println(b);

        int[] myArray = {1, 2, 3, 4, 5};
        myArray[1] = 7;
        System.out.println(Arrays.toString(myArray));

    }
}
