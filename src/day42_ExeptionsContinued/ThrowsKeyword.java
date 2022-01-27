package day42_ExeptionsContinued;
//throws word is used to handle checked exceptions only, basically a fast way to throw an exception in,
// but you cannot use throws in a method. then u must use a try catch block
public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test1");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("Test completed");


    }
}
