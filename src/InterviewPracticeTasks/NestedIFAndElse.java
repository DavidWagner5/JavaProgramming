package InterviewPracticeTasks;

public class NestedIFAndElse {

    public static void main(String[] args) {

        int number = 500;

        if(number>100){

            if(number - 3==495){

                System.out.println("This one works");
            }else if (number - 3==497){

                System.out.println("This one works better");
            }

        }else{

            System.out.println("Invalid number");
        }
    }
}
