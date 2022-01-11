package day20_Arrays;

public class intiialsEX {
    public static void main(String[] args) {

        String [] names = {"Bob", "Ann", "Tom"};
        String initials = "";
        initials = initials + names[0].charAt(0);
        initials = initials + names[1].charAt(0);
        initials = initials + names[2].charAt(0);
        System.out.print(initials);
    }
}
