package day51_Maps;

import java.util.HashMap;
import java.util.Map;

public class iteratingMap2 {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();


        students.put("David", 90);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);


        int count  = 0;

        for (Integer value : students.values()) {
            if(value >= 95){
                count++;
            }




        }

        System.out.println(count);








    }
}
