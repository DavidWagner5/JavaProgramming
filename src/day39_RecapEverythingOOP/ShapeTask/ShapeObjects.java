package day39_RecapEverythingOOP.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(10);

        square.setSide(30);

        System.out.println(square);

        //-----------------------------------------------------------------------

        Rectangle rectangle = new Rectangle(5, 6 );

        System.out.println(rectangle);



        //----------------------------------------------------------------------------------


        Circle circle = new Circle(7.5);



    }
}
