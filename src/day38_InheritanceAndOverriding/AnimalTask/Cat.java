package day38_InheritanceAndOverriding.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super("cat", breed, age, gender, size, color);
    }

    public void eat(){
        System.out.println("eats " + name + " food");
    }
}
