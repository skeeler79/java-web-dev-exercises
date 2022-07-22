package exercises.org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
        String radius = input.nextLine();
        if (radius.matches("-?\\d+(\\.\\d+)?") ) {
            Double newName = Double.parseDouble(radius);
            Double area = Circle.getArea(newName);
            System.out.println("The area of your circle is " + area + ".");
        }

    }
}
