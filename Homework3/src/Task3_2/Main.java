package Task3_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner c = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = c.nextInt();
            int check = n % 10;

            if (check == 7) {
                System.out.println("Yes, last number is a seven!");
            } else {
                System.out.println("No, last number is not a seven :(");
            }
        }



    }
