package assignment6;

import java.util.HashMap;
import java.util.*;

public class Vampire {
    public void  getVampireNumber() {
        int noOfVampireNumbers = 0;
        int presentNumber = 10;
        while (noOfVampireNumbers <= 100) {
            if (isVampire(presentNumber)) {
                System.out.println(presentNumber);
                noOfVampireNumbers += 1;
            }
            presentNumber+=1;

        }
    }


    public  boolean isVampire(int number){
        String numberStr=String.valueOf(number);
        SortString sort = new SortString();
        int power=numberStr.length()/2;
        if(numberStr.length()%2==0){
            for (long i=power;i<=Math.sqrt(number)+1;i++)
            {
                long value=i;
                long factor=number/i;

                if(value%10==0 && factor%10==0 )
                    break;
                else{
                    String xString= String.valueOf(value);
                    String yString= String.valueOf(factor);
                    if(sort.string(numberStr).equals(sort.string(xString+yString))) return true;
                }

            }
        }
        return false;
    }
}
