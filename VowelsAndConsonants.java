import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        word = word.toLowerCase();
        char[] letters = word.toCharArray();
        System.out.print("Vowels: ");
        for (char letter : letters) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.print(letter + " ");
            }
        }
        System.out.println();
        System.out.print("Consonants: ");
        for (char letter : letters) {
            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u' && letter != ' ') {
                System.out.print(letter + " ");
            }
        }
    }
}
