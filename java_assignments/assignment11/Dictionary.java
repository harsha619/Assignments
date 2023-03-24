package assignment11;

import java.util.HashMap;

public class Dictionary {
    public static HashMap<Character,Integer> map(char[] characters){
        HashMap<Character,Integer>map= new HashMap<>();
        for (char character : characters) {
            int noItems=0;
            if(map.containsKey(character) )
                noItems=map.get(character);
            if(Character.isAlphabetic(character))
                map.put(character, noItems + 1);
        }
        System.out.println(map);
        return map;
    }
}
