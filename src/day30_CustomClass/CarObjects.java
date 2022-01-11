package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Lamborghini", "Gallardo", "Black", 2008, 190000);
        System.out.println(car1);


        car1.start();

        car1.stop();


        Car car2 = new Car();
        car2.setInfo("Honda", "Odyssey", "Dark Green", 2000, 33000);
        System.out.println(car2);


        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2));
        System.out.println(carsList);

        for (Car each : carsList) {
            System.out.println(each.Brand + ":" + each.Price);

        }

        //--------------------------------------------------------------------

        //recall the lamborghini if it is between year 2005-2008

        carsList.removeIf(p -> p.Brand.equals("Lamborghini") && p.Year >= 2005 && p.Year<=2008);

        System.out.println(carsList);

    }
}
