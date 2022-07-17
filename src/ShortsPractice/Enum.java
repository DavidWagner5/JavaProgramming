package ShortsPractice;

public class Enum {
//basically for storing sets of values
    public enum day{

        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }


    public static void main(String[] args) {

        day day = Enum.day.Friday;





        System.out.println(day);

    }
}
