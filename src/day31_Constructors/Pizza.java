package day31_Constructors;

public class Pizza {

    public String size;
    public  int numberofCheesetopping;
    public int numberofPepperonitopping;


    public double calcCost(){
        double startingPrice = (size == "S")? 10 :(size =="M")? 12 :  14;
        double totalPrice = startingPrice + (numberofCheesetopping+numberofPepperonitopping) * 2;
        return totalPrice;
    }

    public Pizza(String size, int numberofCheesetopping, int numberofPepperonitopping) {
        this.size = size;
        this.numberofCheesetopping = numberofCheesetopping;
        this.numberofPepperonitopping = numberofPepperonitopping;
    }



    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheesetopping=" + numberofCheesetopping +
                ", numberofPepperonitopping=" + numberofPepperonitopping +
                ", total price = $" + calcCost() +
                '}';
    }



}
