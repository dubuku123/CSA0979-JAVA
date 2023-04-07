import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        String reverseAlphabetical = new StringBuilder(new String(letters)).reverse().toString();
        System.out.println("Word in reverse alphabetical order: " + reverseAlphabetical);
    }
}
