public class NameGenerator {
    public static void main(String[] args) {
        /* Create a Name Generator. We’ll stick to just first and last names.
	Your program should list all possible combinations between a first name
	and a last name from lists that are provided.*/

        String[] arrNames = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
        String[] arrLastname = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};


        for (int i = 0; i < arrNames.length; i++) {
            for(int j = 0; j < arrLastname.length; j++) {
                System.out.println(arrNames[i] + " " + arrLastname[j]);
            }
        }

        System.out.println();
    }
}
