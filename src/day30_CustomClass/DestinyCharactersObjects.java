package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DestinyCharactersObjects {

    public static void main(String[] args) {


        DestinyCharacters toon1 = new DestinyCharacters();
        toon1.setInfo("David", "Hunter", 1345, 'M');

        DestinyCharacters toon2 = new DestinyCharacters();
        toon2.setInfo("Davvid", "Warlock", 1350, 'F');

        DestinyCharacters toon3 = new DestinyCharacters();
        toon3.setInfo("Davvvid", "Titan", 1370, 'M');


        ArrayList<DestinyCharacters> list = new ArrayList<>();
        list.addAll(Arrays.asList(toon1,toon2,toon3));



        int overOrEquals1350 = 0;
        int under1350 = 0;
        boolean areThereMales = false;

        for (DestinyCharacters each : list) {
            if(each.power >= 1350){
                overOrEquals1350++;
            }else{
                under1350++;
            }

            if (each.Gender== 'M'){
                areThereMales=true;
            }

        }

        System.out.println(list);

        System.out.println("areThereMales = " + areThereMales);
        System.out.println("under1350 = " + under1350);
        System.out.println("overOrEquals1350 = " + overOrEquals1350);







    }
}
