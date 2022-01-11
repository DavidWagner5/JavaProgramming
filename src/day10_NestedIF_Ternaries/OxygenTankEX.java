package day10_NestedIF_Ternaries;
/*4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY*/
public class OxygenTankEX {


    public static void main(String[] args) {

        int Oxygen = 50;
        String LevelStatement = "";

        if(Oxygen>=50 && Oxygen<=100){

            if(Oxygen>=90) {
                LevelStatement = "Your Tank is Full";

            }else if(Oxygen>=80) {
                LevelStatement = "Still Okay";

            }else if(Oxygen>=70) {
                LevelStatement = "Don't go too far";

            }else if(Oxygen>=60) {
                LevelStatement = "Start to head back";

            }else{
                LevelStatement = "Be careful, you are now at 50%";
            }

        }else{
            LevelStatement = "Invalid Tank Level";
        }
        System.out.println(LevelStatement);
        }


    }

