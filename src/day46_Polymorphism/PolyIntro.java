package day46_Polymorphism;

import day44_45_OOPAbstraction_Interface.AnimalTask.Animal;
import day44_45_OOPAbstraction_Interface.AnimalTask.Dog;
import day44_45_OOPAbstraction_Interface.ShapeTask.Circle;

public class PolyIntro {

    public static void main(String[] args) {



        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str,n1,n2,r1, new Circle(5)};





        // Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");      //animal ---> is the reference type
        //animal.drink();   works
        //animal.eat();   works
        //animal.play();  doesn't work because we called animal as reference type


        //you can reference using interface as well
        // Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //animal2.isFriendly(); works
        //animal2.play(); works
        //animal2.drink(); doesn't work   ----> because reference type does not have it. we are referencing interface
        //animal2.eat(); doesn't works

        //polymorphism works for class reference and interface reference



        //instance of keyword
        //boolean isCircle = circle1 instanceof Circle;
        //System.out.println(isCircle);   true --->  this is used to verify objects

                    /* if(driver instanceof Chrome){
                    Chrome browser will open
                    }else if(driver instanceof firefox){
                    Firefox browser will open

        */












    }
}
