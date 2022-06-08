package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "bbcccaaaa";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) { //each : characters of String
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println(result);





    }

}

/*
Write a program that can return the frequency of characters by using Map

Ex: str = "bbcccaaaa"
output = {b=2, c=3, a=5}
 */
