public class StringMethods {
    public static void main(String[] args) {
//        equals() method
//        Create new variable using new keyword
        String s = new String("Hello");

        String str = "Hello";
        System.out.println(str.equals("Hello"));
        //output true

//        Compare if str="Hello" is the same with s=new String("Hello")
        System.out.println(str == s);
        // output false

        System.out.println(str.equals(s));
        //output true

//        length() method
        System.out.println(str.length());

//        indexOf() method
        System.out.println(str.indexOf('H'));

//        toUpperCase() method
        System.out.println(str.toUpperCase());

//         toLowerCase() method
        System.out.println(str.toLowerCase());

//        charAt() method
        System.out.println(str.charAt(4));

//        equalsIgnoreCase(String) method
        System.out.println(str.equalsIgnoreCase("HELLO"));

//        substring(int) method
        System.out.println(str.substring(1));

    }
}
