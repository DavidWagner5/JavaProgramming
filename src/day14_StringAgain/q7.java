package day14_StringAgain;

public class q7 {
    public static void main(String[] args) {

        int num = 2;
        boolean b = false;

        switch(num){
            case 0:
                b = false;
            case 1:
                System.out.println(1);
            case 2:
                if(b){
                    System.out.println(2);
                }else{
                    b = false;
                }
            case 3:
                if (b){
                    System.out.println(3);
                    b = false;
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b){
                    break;
                }
                System.out.println(5);


        }
        System.out.println(b);
    }
}
