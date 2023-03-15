package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KycForm {


    public  void getDate(LocalDate signupDate, LocalDate currentDate){

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        if(signupDate.isAfter(currentDate)){
            System.out.println("No range");
        }
        else {
            System.out.println(currentDate.getYear()-signupDate.getYear());
            int yearDiff=currentDate.getYear()-signupDate.getYear();
            signupDate=signupDate.plusYears(yearDiff);
            String fromDate=signupDate.minusDays(30).format(datePattern);
            if(signupDate.isBefore(currentDate)){
                String toDate=signupDate.plusDays(30).format(datePattern);
                System.out.println(fromDate+" "+toDate);
            }
            else {
                System.out.println(fromDate+" "+currentDate.format(datePattern));
            }
        }
    }
}
