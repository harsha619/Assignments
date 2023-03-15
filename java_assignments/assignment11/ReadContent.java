package assignment11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadContent {
    public char[] scanContent(File file) throws IOException {
        Scanner myReader = new Scanner(file);
        StringBuilder mainData = new StringBuilder();
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            mainData.append(data);
        }
        return  stringToChar(mainData.toString());
    }
    public  char[] stringToChar(String str) {
        char [] array= new char[str.length()];
        for (int i=0; i<str.length();i++){
            array[i]=str.charAt(i);
        }
        return array;

    }



}
