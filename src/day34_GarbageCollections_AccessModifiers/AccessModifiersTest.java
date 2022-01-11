package day34_GarbageCollections_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.defaultData);
        System.out.println(AccessModifiers.publicData);


        //you can also do it with custom methods



    }

    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }
}
