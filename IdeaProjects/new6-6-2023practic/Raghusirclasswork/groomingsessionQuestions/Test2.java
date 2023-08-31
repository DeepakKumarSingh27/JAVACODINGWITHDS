package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a st:");
        String st = sc.nextLine();
        System.out.println("Enter the word to replace:");
        String wordReplace = sc.next();
        System.out.println("Enter the replacement word:");
        String newWord = sc.next();
        String newSentence = replaceWord(st, wordReplace, newWord);
        System.out.println("New st: " + newSentence);
    }
    public static String replaceWord(String sentence, String wordToReplace, String newWord) {
        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int wordIndex;
        while ((wordIndex = sentence.indexOf(wordToReplace, startIndex)) != -1) {
            result.append(sentence, startIndex, wordIndex);
            result.append(newWord);
            startIndex = wordIndex + wordToReplace.length();
        }
        result.append(sentence.substring(startIndex));
        return result.toString();
    }
}
