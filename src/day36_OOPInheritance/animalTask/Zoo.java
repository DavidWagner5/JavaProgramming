package day36_OOPInheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Sulley", "PitBull-Lab", 'M', 6, "Large", "Black");
        dog.bark();
        dog.drink();
        dog.move();
        dog.sleep();

        Cat cat = new Cat();
        cat.setInfo("Bobey", "simese", 'F', 16, "Small", "Black");
        cat.meow();
        cat.eat();
        cat.sleep();

        Tiger tiger = new Tiger();
        tiger.setInfo("Liger", "Sumatran", 'M', 3, "Large","Orange");
        tiger.roar();
        tiger.drink();
        tiger.hunt();
    }
}
