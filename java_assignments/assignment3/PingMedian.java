package assignment3;

import java.io.BufferedReader;
import java.io.IOException;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PingMedian {
    public static int median(BufferedReader reader) throws IOException {
        int [] array = new int[4];
        int pingNo=0;
        String tempString = "";

        Pattern pattern = Pattern.compile("time=(\\d+)ms");

        while ((tempString = reader.readLine()) != null) {
            System.out.println(tempString);
            Matcher matcher = pattern.matcher(tempString);
            if (matcher.find()) {
                String timeStr = matcher.group(1);
                int time = Integer.parseInt(timeStr);
                array[pingNo]=time;
                pingNo++;
                System.out.println(time);
            }
        }
        Arrays.sort(array);
        return (array[1]+array[2]/2);

    };



}
