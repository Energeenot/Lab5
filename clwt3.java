package Lab5;

import java.util.Scanner;

public class clwt3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пункт а:");
        System.out.println("Введите два числа");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(12.5 + f(2) - f(4) * f(10) + f(a) - f(b) + f(a * b));
        System.out.println("Пункт б:");
        int[] x = new int[7];
        double[] y = new double[7];
        System.out.println("Введите элементы массива");
        enter_ar(x);
        for (int i = 0; i < 7; i++){
            y[i] = f(x[i]);
        }
        System.out.println("Массив у");
        for (int i = 0; i < 7; i++){
            System.out.print(y[i] + "  ");
        }
        System.out.println();
        System.out.println("Количество отрицательных элементов в массиве у = " + count_otr(y) + ". Максимальный элемент = " + maxn(y));
    }

    static  double f(double x){
        if (x < 0){
            return 7/3;
        }
        if (0 <= x && x < 2 * Math.PI){
            return Math.pow(x, 2) - 3;
        }
        else {
            return (1 + Math.pow(x, 3)) / (2 * x);
        }
    }

    static void enter_ar(int[] a){

        for (int i = 0; i < 7; i++){
            a[i] = scanner.nextInt();
        }
    }

    static int count_otr(double[] a){
        int count = 0;
        for (int i = 0; i < 7; i++){
            if (a[i] < 0){
                count++;
            }
        }
        return count;
    }

    static double maxn(double[] a){
        double max = -1000000000;
        for (int i = 0; i < 7; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
