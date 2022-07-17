package day44_45_OOPAbstraction_Interface;

public abstract class PropertiesOfInterface {

    int a;
    static int b;

    public PropertiesOfInterface(){

        this.a = a;

    }
    static{
        b = 100;

    }

    public void method1 (){
        System.out.println("instance method"); //can be overriden can be overloaded
    }

    public static void method2(){
        System.out.println("Static method"); //cannot be overridden but can be overloaded
    }


    public abstract void method3();

}
