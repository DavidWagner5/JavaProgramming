package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

       Dog dog1 = new Dog();
        dog1.setInfo("Salty", "Soft-Coated Wheaten Terrier", 5, 'M', "Medium", "Tan");

       Dog dog2 = new Dog();
        dog2.setInfo("Sully", "Pit-Bull Lab", 6, 'M', "Large", "Black");

        Dog dog3 = new Dog();
        dog3.setInfo("David", "Pit-Bull", 2, 'M', "Large", "White");

        Dog dog4 = new Dog();
        dog4.setInfo("ObiWan", "Pit-Bull", 4, 'F', "Medium", "Blue");

        Dog dog5 = new Dog();
        dog5.setInfo("Han", "Lab", 3, 'F', "Small", "Brown");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};



            ArrayList<Dog> femaleDogs = new ArrayList<>();
            femaleDogs.addAll(Arrays.asList(dog4, dog5));
            int count = 0;

        for (Dog each : femaleDogs) {
            count++;
        }
        System.out.println(count);

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3));


        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);














    }

}
