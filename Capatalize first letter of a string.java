import java.util.*;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        // Scanner class for taking input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a word: ");
        
        // taking input of a word
        String word = scn.nextLine();
        
        // taking out first letter of the word using substring function
        String firstLetter = word.substring(0, 1);
        
        // capitalizing the first letter using toUpperCase function
        firstLetter = firstLetter.toUpperCase();
        String restOfWord = word.substring(1);
        
        String capitalizedWord = firstLetter + restOfWord;
        System.out.println("Capitalized word: " + capitalizedWord);
    }
}