public class SwapElements{
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};

        //store in temp the first element of our array temporarily
        int temp = elements[0];

        //swap the elements the first element replace by the last element of my array
        elements[0] = elements[elements.length-1];
        //the last element of my array take the temp value
        elements[elements.length-1] = temp;
        //print the results
        for (int i = 0; i < elements.length; i++){
            System.out.println(elements[i]);
        }
    }
}