package day14_StringAgain;

public class q1 {
    public static void main(String[] args) {

        int cookies = 10;
        String day = "tuesday";

        switch(day){
            case "sunday":
                cookies++;
            case "monday":
                cookies +=5;
                break;
            case"tuesday":
            case "wednesday":
                cookies+=10;
            case "thursday":
                cookies +=5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies = 0;



        }
        System.out.println(cookies);
    }
}
