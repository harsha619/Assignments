package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases= scan.nextInt();
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while(testCases>0){
            String signupDate= scan.next();
            String currentDate= scan.next();
            LocalDate signupDateParsed = LocalDate.parse(signupDate, datePattern);
            LocalDate currentDateParsed = LocalDate.parse(currentDate,datePattern);
            KycForm kycForm= new KycForm();
            kycForm.getDate(signupDateParsed,currentDateParsed);
            testCases--;
        }

    }
}
