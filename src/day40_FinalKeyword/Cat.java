package day40_FinalKeyword;

public final class Cat extends Animal{
    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    @Override
    public void eat(){
        System.out.println(getName()+ " is eating cat food");
    }

   public void meow(){
       System.out.println(getName()+ " is meowing");
   }
}
