import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        //create some dummy data for our method
        char letter = 'z';
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char num =  5;
        char[] numbers = {1, 2, 3, 4, 5, 6};

        //call your methods here
        LinearSearch ls = new LinearSearch();
//        System.out.println(ls.findIndex(letter, letters));

        //call exercise one
        System.out.println(ls.findLetterBackwards(letter, letters));

        //call exercise two
        System.out.println(ls.BinarySearch(num, numbers));
    }

    public int findIndex(char target, char[] data) {
        if (data == null) return -1;

        int result = 0;
        for (int i = 0; i < data.length; i++) {
            char temp = data[i];
            if (temp == target) {
                return i;
            }
        }
        return result;
    }

    /* Create a variation of the findLetter method that starts the search at the back
    of the dataset as opposed to the front. You may call the method findLetterBackwards. */

    public static int findLetterBackwards(char t, char[] d) {
        if (d == null) return -1;

        int result = 0;
        for (int i = d.length - 1; i > -1; i--) {
//            System.out.println(d[i]);
            char temp = d[i];
            if (t == temp) {
                result = i;
            }
        }
        return result;
    }

    /* Create another variation of the findLetter method, but this time, make it start in
    the middle of the dataset and search in both directions from the middle.
    You can use the findLetter(..) and findLetterBackwards(..) methods. You may call
    this method from within findLetterFromMiddle(..). */

    //    import java.util.Arrays;
    /* EXAMPLE:
        char num = '50';
        char[] numbers= {10, 20, 30, 40, 50, 60}; */
    public int BinarySearch(char target, char[] data) {
        // get the first and the last index of our array data
        // index 0
        int indexLeft = 0;
        // index 5
        int indexRight = data.length - 1;

        // compare if the value of left id less or equal to the right
        // while ( 0 <= 5)
        while (indexLeft <= indexRight) {
            // indexMid = 0 + (5 - 0) / 2 => 0 + 5 / 2 => 2.5 as is a int value lost .5 and final value is 2!!!
            int indexMid = indexLeft + ((indexRight - indexLeft) / 2);
            // if ( 30 == 50)
            if (data[indexMid] == target) {
                return indexMid;
                // if (50 < 30)
            } else if ( target < data[indexMid]) {
                // not applicable
                indexRight = indexMid - 1;
            } else {
                // 50 > 30 => 0 => 3 indexLeft = 3
                indexLeft = indexMid + 1;
            }
        }
        return -1;
    }
}
