package day23_CustomMethod;
/*3. create a method that can check if a person is eligible to buy alcohol*/
public class CustomMethodDinnerTask5 {
    public static void main(String[] args) {

        eligibleTobuy(19);


    }

    public static void eligibleTobuy (int age){

        if(age>=18){
            System.out.println("eligible to buy alcohol");
        }else{
            System.out.println("not eligible to buy alvohol");
        }


    }
}
