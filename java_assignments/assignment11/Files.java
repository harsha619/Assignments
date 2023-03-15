package assignment11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Files {
    public  void createFile(HashMap<Character,Integer> map) throws IOException {
        File file = new File("example.txt");

        FileWriter writer = new FileWriter(file);
        BufferedWriter buffer= new BufferedWriter(writer);

        map.forEach((key, value) -> {
            try {
                buffer.write( key);
                buffer.write(value.toString());
                buffer.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        buffer.close();
        writer.close();
    }
}
