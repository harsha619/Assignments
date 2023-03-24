package assignment3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static assignment3.PingMedian.median;

public class Ping {
    public void getPing(String url) {



        try {
            Process process= Runtime.getRuntime().exec("ping "+url);
            InputStream inputStream = process.getInputStream();
            BufferedReader reader= new BufferedReader(
                    new InputStreamReader(inputStream));

            System.out.println("median "+median(reader)+"ms");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
