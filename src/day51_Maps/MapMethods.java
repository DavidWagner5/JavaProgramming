package day51_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name and score


        Map<String, Integer> students = new HashMap<>();

        System.out.println(students);

        students.put("David", 90);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        System.out.println(students.get("Alex")); //get method in map

        System.out.println(students.replace("Alex", 75));

        System.out.println(students);

        System.out.println(students.remove("serkan"));



        //---------------------------------------

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1.equals(map2));
    }
}
