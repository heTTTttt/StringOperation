import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        TasksMethods tm = new TasksMethods();
        System.out.println(tm.findSymbolOccurance("Hello", 'l'));
        System.out.println("----------------------------");
        System.out.println(tm.findWordPosition("Apple", "plant"));
        System.out.println("----------------------------");
        System.out.println(tm.stringReverse("Hello"));
        System.out.println("----------------------------");
        System.out.println(tm.isPalindrome("Madam   Adam"));
        System.out.println("----------------------------");
        System.out.println(tm.hiddenAnswerWord());
    }
}
