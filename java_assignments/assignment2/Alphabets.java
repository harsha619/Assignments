package assignment2;

import java.util.HashSet;

public class Alphabets {
    private final String string;
    private final Integer length;
    private final char [] stringArray;
    public Alphabets(String string){
        this.string=string;
        this.length=string.length();
        this.stringArray=new char[length];
    }
    public void stringToArray(){
        for (int i=0;i<length;i++){
            stringArray[i] = string.charAt(i);
        }
    }
    public int convertToSet(){
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<length;i++){
            char tempChar=stringArray[i];
            if (Character.isAlphabetic(tempChar))
                if ('a' > tempChar) {
                char value = (char) (tempChar+32);
                set.add(value);
                }
                else
                    set.add(tempChar);

        }
        return set.size();
    }
}
