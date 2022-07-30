package exercises;
import java.util.Scanner;

public class Alice {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or conversations" +
                " in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        System.out.println("Type a word to search for: ");
        String searchedWord = input.nextLine().toLowerCase();
        boolean containsWord = sentence.contains(searchedWord);
        int indexOfWord = sentence.indexOf(searchedWord);
        int wordLength = searchedWord.length();
        String newSentence = sentence.replace(searchedWord, "");
        System.out.println("Does the text contain your word? " +containsWord);
        System.out.println("You word first appears at index: " +indexOfWord + " and a length of: "+ wordLength);
        System.out.println("The updated text is: " + newSentence);

    }
}
