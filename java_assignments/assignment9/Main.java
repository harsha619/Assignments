package assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String sentence = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        Matcher matcher = pattern.matcher(sentence);

        if (matcher.matches()) {
            System.out.println("matches the pattern.");
        } else {
            System.out.println("does not match the pattern.");
        }

    }
}
