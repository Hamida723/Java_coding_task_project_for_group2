package week_04;

import java.util.HashMap;
import java.util.Map;

public class week04Tasks_A_A {
    public static void main(String[] args) {
        System.out.println("--------STRING----FREQUENCY OF CHARECTERS-------");
        //Write a return method that can find the frequency of characters
        String frequency = frequencyOfChar("ABBCCDD");
        System.out.println(frequency);
        System.out.println("-----------STRING---SAME----LETTERS-------------");
        //Write a return method that check if a string is build out of the
        //same letters as another string.

    }

    private static String frequencyOfChar(String str) {
        // Create  HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                c = Character.toUpperCase(c);
               frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        String result = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            if (frequencyMap.containsKey(c)) {
                result += c + "" + frequencyMap.get(c) + "";
            }
        }


        return result;
    }


}



































