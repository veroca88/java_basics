
public class ExampleOne {

    public static void main(String[] args) {
        //create some dummy data for our method
        int input = 5;
        ExampleOne eo = new ExampleOne();

        //call your methods here
        System.out.println(eo.factorial(input));

        //call exercise one
        eo.printAlphabet('l');

        //call exercise two
        int[] numArr = {1, 2, 3, 4, 5, 6};
        int checkTheNum = eo.exerciseTwo(2, numArr);
        System.out.println(checkTheNum);
    }
    //create your first method here
    public int factorial(int param) {
        if (param <= 0) return 0;
        if (param == 1) return 1;
        return param * factorial(param - 1);
    }
    /* Exercise One
    Write a recursive method to print itself and all previous letters of the alphabet
    given a single letter on the same line. You can assume the letter will be lowercase.
    HINT: Use the char data type as it is easy to convert one letter to the next using
    mathematical operators.*/

    public void printAlphabet(char param) {
        if (param < 'a' || param > 'z') return;
        System.out.println(param);
        param -= 1;
        printAlphabet(param);
    }

    /* Exercise Two
Implement binary search using recursion. You should search upon an int array and return the
index of a given int. If the number is not in the list, then return -1;
int[] numArr = {1, 2, 3, 4, 5, 6};
int target = 2*/
    public int exerciseTwo(int target, int[] array ) {
        int left = 0;
        int right = array.length -1; // 5
        //      0 <= 5
        while (left <= right) {
            int mid = left + ((right - left) / 2); // 5/2 = 2.5 = 2
            //  numArr[2] = 3 == 2 (target) false
            if (array[mid] == target) {
                return mid;

                //  numArr[2] = 3 > 2 (target) true!!
            } else if (array[mid] > target) {
                //      2 - 1 = 1
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }
}

