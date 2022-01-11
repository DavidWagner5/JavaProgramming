package day19_LoopPractices;

public class ExitMethodEX {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i==3){
                //break terminates loop "012woodenspoon"
                //continue skips the stated thing "124woodenspoon
                System.exit(0);//terminates the program "012"
            }
            System.out.println(i);
        }

        System.out.println("woodenspoon");
    }
}
