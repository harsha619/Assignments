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
                long x=i;
                long y=number/i;

                if(x%10==0 && y%10==0 )
                    break;
                else{
                    String xString= String.valueOf(x);
                    String yString= String.valueOf(y);
                    if(sort.string(numberStr).equals(sort.string(xString+yString))) return true;
                }

            }
        }
        return false;
    }
}
