package day10_NestedIF_Ternaries;
/*
single if: for one condition
if&else: for 2 condition only
multibranch if: for 3 or more condition
nested if: for pre condition
 */
public class NestedifCL {

    public static void main(String[] args) {

        int score =400;

        if(score>=0&&score<=100){//if the score is valid
            if (score>=60){
                System.out.println("Passed");//if the student passed
            }else{
                System.out.println("Failed");//if the student failed
            }
        }else{
            System.out.println("Invalid Score");//if score is invalid
        }
    }
}//---------------------------



