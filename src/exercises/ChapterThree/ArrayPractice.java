package exercises;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.printOddNumbers();
//        arrayPractice.separateWords();
        arrayPractice.separateSentences();
    }

    public void printOddNumbers() {
        int[] newArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < newArray.length; i++) {

//            for (i : newArray) {
                if (newArray[i] % 2 != 0) {
                    System.out.println(newArray[i]);
                }
            }
        }


    public void separateWords() {
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] crackedEggs = greenEggs.split(" ");
        System.out.println(Arrays.toString(crackedEggs));
    }

    public void separateSentences() {
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] crackedEggs = greenEggs.split("\\.");
        System.out.println(Arrays.toString(crackedEggs));
    }
}


//

