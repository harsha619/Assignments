package assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        FileReading fileMatcher = new FileReading(filePath);

        while(true) {
            String inputString = scanner.nextLine();
            if(inputString.equals("stop"))
                break;
            fileMatcher.checkFile(inputString);
        }
    }
}