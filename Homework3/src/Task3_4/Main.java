package Task3_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число рублей: ");
        int n = scanner.nextInt();
        int check1 = n % 100;
        int check2 = n % 10;




            if ((check1 >= 11 && check1 <= 20) || (check2 >= 5 && check2 <= 9) || (check2 == 0)) {
                System.out.println(n + " рублей");
            }
        else if (check2 == 1) {
            System.out.println(n + " рубль");
        }

        else {
                System.out.println(n + " рубля");
            }

    }
}
