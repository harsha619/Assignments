package assignment6;

import java.util.Arrays;

public class SortString {

    public String string(String string) {
        char[] strArr = string.toCharArray();
        Arrays.sort(strArr);
        return new String(strArr);
    }
}
