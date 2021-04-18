public class MethodDeclaration<modifier> {
    public static void main(String[] args) {
        //create a class instance (First method)
        MethodDeclaration md = new MethodDeclaration();
        //call your first method here
        md.talk();

        //call second method here
        int value = 150;
        int sameValue = md.getInt(value);
        System.out.println(sameValue);

        //call the third method here
        System.out.println(md.sum(1,2,4.5));

        //create your forth method here
        int num = md.randomNumber();
        System.out.println(num);


    }
    //create your first method here
    public void talk(){
        System.out.println("Inside of the talk method");
    }
    //create your second method here
    public int getInt(int input) {
        return input;
    }
    //create your third method here
    public double sum(int x, int y, double z){
        return x + y + z;
    }

    /*create a methods that should return a random number between 1 and 50, inclusively.
     This method should be called randomNumber(), it should be have a public access modifier
     and return an int datatype. It should not declare any parameters or exceptions. */

    public int randomNumber() {
        int result = (int)(Math.random() * 50) + 1;
        return result;
    }
}
