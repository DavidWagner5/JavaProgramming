package day30_CustomClass;

public class Car {

    public String Brand;
    public String Model;
    public String Color;
    public int Year;
    public double Price;


    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){

        Brand = carBrand;
        Model = carModel;
        Color = carColor;
        Year = carYear;
        Price = carPrice;


    }

    public void start(){
        System.out.println(Model + " is Starting");
    }

    public void stop(){
        System.out.println(Model + " is stopping");
    }

    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Year=" + Year +
                ", Price=" + "$" + Price +
                '}';
    }
}
