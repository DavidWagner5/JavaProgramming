import day30_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo (String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }




    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

class DogObjects{

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
        maleDogs.addAll(Arrays.asList(dog1, dog2, dog3));


        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);


    }



    }
