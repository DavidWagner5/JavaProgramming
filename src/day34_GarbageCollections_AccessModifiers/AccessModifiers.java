package day34_GarbageCollections_AccessModifiers;
//public, protected, default, private
/* public = you can import class anywhere,
default = you can only use class within the same package,
protected = not always visible outside the package,
private = you can't use it anywhere
 */
public class AccessModifiers {

    public static int publicData = 100; //public
    static int defaultData = 200; //default
    private static int privateData = 300; //private


    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

}
