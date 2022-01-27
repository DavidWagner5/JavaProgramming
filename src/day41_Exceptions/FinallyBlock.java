package day41_Exceptions;
//finally block always gets executed unless there is a system.exit statement before it
public class FinallyBlock {

    public static void main(String[] args) {
         int[] arr = {1,2,3};

         try{
             System.out.println(arr[10]);
             System.out.println("Try block");
         }catch(RuntimeException e){
             System.out.println("Catch block");
             e.printStackTrace();
         }finally{
             System.out.println("Finally block");
         }
    }
}
