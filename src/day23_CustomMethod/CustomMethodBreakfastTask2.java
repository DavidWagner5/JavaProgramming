package day23_CustomMethod;

public class CustomMethodBreakfastTask2 {

    public static void main(String[] args) {
        domain("davewgnr@yahoo.com");
        arraydomain(new String [] {"Davewgnr@yahoo.com"});
        nameOfMonth(4);
    }

    public static void domain(String email){

        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("domain = " + domain);
    }

    public static void arraydomain(String email[]){

        for (String each : email) {

            each = each.substring(each.indexOf("@")+1);
            System.out.println(each);
        }
    }

    public static void nameOfMonth(int number){

        if(number>=1 && number<=12){
            System.out.println((number==1)? "January" :(number==2)? "February" :(number==3)? "March" :(number==4)? "April" :(number==5)? "May" :(number==6)? "June"
                    :(number==7)? "July" :(number==8)? "August" :(number==9)? "September" :(number==10)? "October" :(number==11)? "November" : "December");
        }else{
            System.out.println("Invalid month");
        }
    }



}
