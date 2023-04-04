package tack;

import java.util.Scanner;

public class Tack_4 {
    public static void calkulator() {
        int result = 0;
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int first_number = scanner.nextInt();
        System.out.println("Введите второе число");
        int second_number = scanner.nextInt();
        System.out.println("Введите операцию + - * /");
        String operation = scanner.next();
        if(operation.equals("+")){
            result = first_number+second_number;
        }
        if(operation.equals("-")){
            result = first_number-second_number;
        }
        if(operation.equals("*")){
            result = first_number*second_number;
        }
        if(operation.equals("/")){
            result = first_number/second_number;
        }
        System.out.println(result);

    }
}
