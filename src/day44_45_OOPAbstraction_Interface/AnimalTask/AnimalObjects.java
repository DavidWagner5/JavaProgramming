package day44_45_OOPAbstraction_Interface.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {


        Animal dog1 = new Dog("Sully", "Pit", 'M', 6, "Large", "Black");






        boolean isdog = dog1 instanceof Cat;


        System.out.println(isdog);

    }
}
