package Lab5;

import java.util.Scanner;

public class clwt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result = sum(proizvedenie(sum(raznost(a, 2), b), 5), proizvedenie(1000, a));
        System.out.println(result);
    }

    static double sum(double n, double c){
        return n + c;
    }

    static double raznost(double n, double c){
        return n - c;
    }

    static double proizvedenie(double n, double c){
        return n * c;
    }
}
