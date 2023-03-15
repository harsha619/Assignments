package assignment11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadContent readContent= new ReadContent();
        Files createFile=new Files();


        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();


        File file = new File(filePath);


        if (!file.isFile() || !file.exists()) {
            System.out.println("file");
        } else {

           char[] array=readContent.scanContent(file);
           HashMap<Character,Integer> map= Dictionary.map(array);
           createFile.createFile( map);

        }
    }
}
