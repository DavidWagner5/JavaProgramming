package day35_OOPEncapsulation;
/*1. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString() */
public class Dog {

    public String breed;
    public String size;
    public char gender;
    public int age;
    public boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, boolean isFriendly){
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }


    static{
        int numberOfLegs = 4;
        int numberOfEyes = 2;
        int numberOfWings = 0;
    }


    public void eat(){
        System.out.println(breed+" is eating");
    }
    public void drink(){
        System.out.println(breed+" is drinking");
    }
    public void sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(){
        System.out.println(breed+" is playing");
    }
    public void bark(){
        System.out.println(breed+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }

    //---------------------------------------------------------


    public static void main(String[] args) {
        Dog dog1=new Dog("Karabas","Large",'M',4,true);
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.sleep();

    }
}

