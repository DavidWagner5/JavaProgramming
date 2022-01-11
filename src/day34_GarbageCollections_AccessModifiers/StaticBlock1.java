package day34_GarbageCollections_AccessModifiers;
//used for initializing static variables, runs first before anything
public class StaticBlock1 {

    public static void main(String[] args) {
        System.out.println("Main Method");

    }

    static{//static gets executed before anything
        System.out.println("Block1");
    }

    static{
        System.out.println("Block2");
    }




}
