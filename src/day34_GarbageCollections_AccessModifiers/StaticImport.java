package day34_GarbageCollections_AccessModifiers;
//import static packageName.className.staticMember;  =   to import one static member
//import static packageName.className.*;    =            imports all the static members of the class



import static day34_GarbageCollections_AccessModifiers.Circle.*;
import static utilities.MathUtility.sum;


public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        //-------------------------------
       int nums =  sum(100,200);

        System.out.println(nums);



    }
}
