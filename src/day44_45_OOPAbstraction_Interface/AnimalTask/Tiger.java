package day44_45_OOPAbstraction_Interface.AnimalTask;

public final class Tiger extends Animal implements Wild {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a deer");

    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}



