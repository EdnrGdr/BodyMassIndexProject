import java.util.Scanner;

public class Main {

    public static  void main (String [] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please Your Height! : ");
        double height = scanner.nextDouble();

        System.out.print("Please Your Weight! : ");
        double weight = scanner.nextDouble();

        double BodyMassIndex =  weight / (height  * height);
        System.out.println("Your BodyMassIndex: " + BodyMassIndex );

    }
}
