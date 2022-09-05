package Lab5;

import java.util.Scanner;

public class clwt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пункт а:");
        System.out.println("Введите два числа");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double result = (double)(factorial(n) * factorial(m)) / factorial(n + m);
        System.out.println(result);
        System.out.println("Пункт b:");
        System.out.println("Введите число и его степень");
        int x = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(degree(x, s));
//        5^6 / 5^3 + 25
        System.out.println((double)degree(5, 6) / (degree(5, 3) + 25));
    }

    static int factorial(int n){
        int result = 1;
        for (int i = 1; i < n + 1; i++){
            result *= i;
        }
        return result;
    }

    static int degree(int x, int n){
        int result = 1;
        for (int i = 0; i < n; i++){
            result *= x;
        }
        return result;
    }
}
