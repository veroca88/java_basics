public class ReturnTypes {
    public static void main(String[] args) {

        ReturnTypes rt = new ReturnTypes();
        //call void return method
        rt.returnNothing();

        //call return boolean method
        boolean b = rt.returnBoolean();
        System.out.println("The value of b is: " + b);

        //call return double
        double d = rt.getPI();
        System.out.println(d);

        //call return char
        char[] alphabet = rt.getAlphabetArray();
        System.out.println(alphabet);
    }

    // VOID RETURN TYPE
    public void returnNothing() {
        System.out.println("Inside of a void method");
    }

    // BOOLEAN RETURN TYPE
    public boolean returnBoolean() {
        return true;
    }

    // DOUBLE RETURN TYPE
    public double getPI() {
        return Math.PI;
    }

    // CHAR RETURN TYPE
    public char[] getAlphabetArray() {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        return letters;
    }

}
