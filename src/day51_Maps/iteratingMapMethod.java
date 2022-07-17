package day51_Maps;

import day33_Statics.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class iteratingMapMethod {

    //KEY.SET method for iterating keys
    //students.values method for iterating value
    //entry set gets you both components


    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();


        students.put("David", 90);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);


        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            Integer Value = students.get(key);
            if(Value>=90){
                earlyBirds.put(key,Value);
            }else{
                angryBirds.put(key,Value);
            }

        }

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);




        int maxScore = Integer.MIN_VALUE;
        int minScore= Integer.MAX_VALUE;

        for (Integer value : students.values()) {
            if(value>maxScore){
                maxScore = value;
            }

            if(value< minScore){
                minScore = value;

            }

        }


        System.out.println(maxScore);
        System.out.println(minScore);

        //---------or



        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println(max);
        System.out.println(min);











    }
}
