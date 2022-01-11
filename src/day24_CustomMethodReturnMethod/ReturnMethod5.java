package day24_CustomMethodReturnMethod;
// create a function that can calculate the grade

/*
check the grade if the grade is 'A' ==  excellent ,b,c,d,f
 */
public class ReturnMethod5 {
    public static void main(String[] args) {

        String str1 = grade(95);



        System.out.println(str1.equals("A")? "Excellent" :(str1.equals("B")? "Great" :(str1.equals("C")? "Good" :(str1.equals("D")? "Pass" : "Fail"))));




    }

    public static String grade(int score){
        String result = "";
        if(score<0 || score>100){
           result = "Invalid";
        }else{
            result = (score>=90) ? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" :"F";
        }
        return result;
    }
}
