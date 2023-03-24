package assignment1;

import java.io.File;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReading {
    public final String filePath;
    public  FileReading(String filePath){
        this.filePath=filePath;

    }

    public  void checkFile(String fileName){
        File folder=new File(filePath);

        File[] fileList = folder.listFiles();
        // Gets all files and directories
        int flag= 0;

        for (File file : Objects.requireNonNull(fileList)) {
            if (file.isFile()) {
                Pattern pattern = Pattern.compile(fileName);
                Matcher matcher = pattern.matcher(file.getName());
                if (matcher.find()) {
                    String filePath = file.getPath();
                    System.out.println(filePath);

                    flag=1;
                    break;
                }

            }
        }
        if(flag==0)
            System.out.println("file not found");
    }


    
}
