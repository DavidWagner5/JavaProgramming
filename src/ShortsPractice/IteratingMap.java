package ShortsPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
//iterate each key by using keySet() method
    //iterate eachvalue by using values
    //iterate each set by using entry set

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();



        map.put(10, "David");
        map.put(40, "Jeff");
        map.put(15, "alexander");
        map.put(17, "Dad");


        for (Integer eachKey : map.keySet()) {

            System.out.println(eachKey);

        }


        for (String eachValue : map.values()) {


            System.out.println(eachValue);
        }


        for (Map.Entry<Integer, String> both : map.entrySet()) {

            System.out.println(both);

        }




    }
}
