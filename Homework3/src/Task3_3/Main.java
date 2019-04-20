package Task3_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = s.nextDouble();

        System.out.println("Enter b: ");
        double b = s.nextDouble();

        System.out.println("Enter r: ");
        double r = s.nextDouble();

        if (r >= (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))/2) {
            System.out.println("Krug zakroet otverstie");
        }
        else {
            System.out.println("Krug malovat :(");
        }

    }

}
