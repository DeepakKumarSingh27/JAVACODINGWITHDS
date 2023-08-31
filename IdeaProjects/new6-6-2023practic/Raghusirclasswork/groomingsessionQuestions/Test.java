package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = scanner.nextLine();
        System.out.println("Enter the Word");
        String wordToReplace = scanner.nextLine();
        System.out.println("Replaced word you want to");
        String replacementWord = scanner.nextLine();
        int indexOfWordToReplace = str.indexOf(wordToReplace);
        while (indexOfWordToReplace != -1) {
            str = str.replace(wordToReplace, replacementWord);
            indexOfWordToReplace = str.indexOf(wordToReplace);
        }
        System.out.println(str);
    }

}

