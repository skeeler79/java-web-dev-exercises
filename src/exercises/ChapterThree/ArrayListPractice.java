package exercises;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
//        ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        System.out.println(ArrayListPractice.evenSum(numbersToSum));
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String [] greenEggsSplit = greenEggs.split(" ");
        ArrayList<String> greenEggsList = new ArrayList<String>(Arrays.asList(greenEggsSplit));
        ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList("Hello", "GoodBye", "Fives"));
        ArrayListPractice.wordsWithFiveLetters(listOfWords);
        ArrayListPractice.userChoice(greenEggsList);

    }

    public static Integer evenSum(ArrayList<Integer> valuesToSum) {
        int sum = 0;
        for (int num : valuesToSum) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void wordsWithFiveLetters(ArrayList<String> words) {

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 5) {
                System.out.println(words.get(i));

            }
        }
    }

    public static void userChoice(ArrayList<String> words) {
        Scanner userNum = new Scanner(System.in);
        System.out.println(("Enter number of letters: "));
        int numOfLetters = userNum.nextInt();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == numOfLetters) {
                System.out.println(words.get(i));

            }
        }
    }
}





