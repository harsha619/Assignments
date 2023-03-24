package assignment3;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();
        Ping ping= new Ping();
        ping.getPing(url);
    }

}
