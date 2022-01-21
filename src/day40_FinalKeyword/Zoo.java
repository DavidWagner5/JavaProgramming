package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "black", "medium", 7);

        dog.eat();
        dog.bark();

        System.out.println(dog.getName());
        dog.setAge(8);
        System.out.println(dog.getAge());


    }
}
