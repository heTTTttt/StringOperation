import java.util.Random;
import java.util.Scanner;

public class TasksMethods implements Methods {

    private String name;

    @Override
    public String findSymbolOccurance(String s, char c) {
        StringBuilder builder = new StringBuilder();

        return builder.append("Літера ").append(c).append(" у слові ")
                .append(s).append(" використовується ").append(s.chars().filter(x -> x == c).count()).append(" разів").toString();

    }

    @Override
    public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    @Override
    public String stringReverse(String s) {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();

    }

    @Override
    public boolean isPalindrome(String s) {
        return s.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(s.replaceAll("\\W", ""))
                        .reverse().toString());
    }
    public String hiddenAnswerWord(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int hiddenArrNum = random.nextInt(words.length);
        String hidden = words[hiddenArrNum];
        //System.out.println(hidden); цей рядок для тестування.
        int num;
        char[] hiddenArr = hidden.toCharArray();
        while (true) {
            String answer = scanner.nextLine();
            char[] answerArr = answer.toCharArray();

            if (hiddenArr.length > answerArr.length) {
                num = answerArr.length;
            } else {
                num = hiddenArr.length;
            }
            if (!hidden.equalsIgnoreCase(answer)) {
                for (int i = 0; i < num; i++) {
                    if (hiddenArr[i] == answerArr[i]) {
                        System.out.print(hiddenArr[i]);
                    } else {
                        System.out.print("#");
                    }
                }
                for (int i = 0; i < 15 - hiddenArr.length; i++) {
                    System.out.print("#");
                }
            } else {
                System.out.println(hidden);
                break;
            }
            System.out.println();
        }
        return "";
    }
}
