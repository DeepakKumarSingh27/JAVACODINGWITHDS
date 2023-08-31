package OneDimensionArray;
import java.util.*;
public class Arr24 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of names: ");
            int n = scan.nextInt();
            String[] names = new String[n];
            scan.nextLine();
            System.out.println("Enter the names: ");
            for (int i = 0; i < n; i++) {
                names[i] = scan.nextLine();
            }
            System.out.println("The longest name is: " + findLongestName(names));
        }

        public static String findLongestName(String[] names) {
            String longestName = "";
            for (String name : names) {
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }
            return longestName;
        }
    }

