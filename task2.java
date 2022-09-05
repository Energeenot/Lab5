package Lab5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения а, b, c, x");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(2 * f(a, b, c, x) + 10);
    }

    static  double f(int a, int b, int c, int x){
        if (x < 5 && b != 0){
            return a * Math.pow(x + 7, 2) - b;
        }
        if (x > 5 && b == 0){
            return (double)(x - c * b) / (a * x);
        }
        else {
            return (double) x / c;
        }
    }
}
