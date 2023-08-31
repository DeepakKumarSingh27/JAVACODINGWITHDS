import java.util.Scanner;

public class Str22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String reversedSentence = reverseLetters(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseLetters(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            sb.append(reversedWord).append(" ");
        }
        return sb.toString().trim();
    }
}
