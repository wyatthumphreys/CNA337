/*
    Counts the number of letters in a word. Word supplied via argument.
    CNA337
    Zachary Rubin zrubin@rtc.edu
 */
import java.util.Scanner;
class LetterCounter {

  public static void main (String[] args) {
    int LetterCount = 0;
    Scanner scanner = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter word: ");
    String check_word = scanner.next();
    String single_letter = "";

    System.out.print("The length of your word is: " );
    System.out.println(check_word.length());
  }
}