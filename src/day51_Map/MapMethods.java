package day51_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score

        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87); //this will be printed

        System.out.println(students);
        System.out.println(students.size());

        //display the score of Alex:
        System.out.println(students.get("Alex")); //96

        //replace Ali's score to 90
        students.replace("Ali", 90);
        System.out.println(students);

        //remove
        students.remove("Alex");
        System.out.println(students.size());
        System.out.println(students);
        students.remove("Ozan");
        System.out.println(students.size());
        System.out.println(students);
        //map can only contain pairs. When a key removed from the map, its value will also be removed

        //containsKey
        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println("r1 = " + r1); //false
        System.out.println("r2 = " + r2); //true

        //containsValue
        boolean r3 = students.containsValue(100);
        System.out.println("r3 = " + r3); //false

        //isEmpty
        System.out.println(students.isEmpty()); //false

        System.out.println("================================================================");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2); //false
        System.out.println(map1.equals(map2)); //true

        //clear
        map1.clear();
        map2.clear();

        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);







    }

}
