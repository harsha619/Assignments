package assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string = input.next();
        Alphabets alphabets = new Alphabets(string);
        alphabets.stringToArray();
        if(alphabets.convertToSet()==26){
            System.out.println("it contains all the alphabets");
        }
        else
            System.out.println("it does not contains all the alphabets");
    }
}
