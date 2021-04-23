public class Constructor {
    public Constructor(int value) {
        System.out.println(value);
    }

    public Constructor() {
        System.out.println("DEFAULT CONSTRUCTOR RAN.");
    }

    public static void main(String[] args) {
        Constructor c = new Constructor((1234));

        Constructor cNoArg = new Constructor();
    }
}
