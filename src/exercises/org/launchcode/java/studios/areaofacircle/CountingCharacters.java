package exercises.org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();
        input.close();

//        String sentence = "If the product of two terms is zero then common sense says at least one of the two " +
//                "terms has to be zero to start with. So if you move all the terms over to one side, you can put " +
//                "the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
        sentence = sentence.toLowerCase();
        char[] charactersInString = sentence.toCharArray();

        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch : charactersInString) {

            if (count.containsKey(ch)) {
                int valueCount = count.get(ch);
                count.put(ch, valueCount + 1);

            } else {
                count.put(ch, 1);

            }

        }
        for (Map.Entry<Character, Integer> item : count.entrySet()) {
            System.out.println(String.format("%s : %s", item.getKey(), item.getValue()));
        }

    }
}
