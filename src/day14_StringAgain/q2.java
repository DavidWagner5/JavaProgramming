package day14_StringAgain;

public class q2 {
    public static void main(String[] args) {

        String str = "";
        int num = 20;

        switch(num){
            case 0:
                str = "C# ";
                break;
            case 10:
                str += " is";
            case 15:
                str = "fun";

            case 20:
                str +="java ";
            case 25:
                str += "is ";
                break;
        }
        System.out.println(str);
    }
}
