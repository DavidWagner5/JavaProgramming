package day38_InheritanceAndOverriding.AnimalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super("dog", breed, age, gender, size, color);
    }


    public void eat(){
        System.out.println("eats " + name + " food");
    }
}
