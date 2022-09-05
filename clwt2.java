package Lab5;

import java.util.Scanner;

public class clwt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х1 и у1");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите х2 и у2");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Пункт а, длина соединяющего отрезка =  " + rastoyanie2t(x2, x1, y2, y1));
        System.out.println("Пункт б:");
        System.out.println("Расстояние от первой точки до начала координат = " + rastoyanie(x1, y1));
        System.out.println("Расстояние от второй точки до начала координат = " + rastoyanie(x2, y2));
        System.out.println("Пункт в:");
        System.out.println("Введите х3 и у3");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double a = rastoyanie2t(x2, x1, y2, y1);
        double b = rastoyanie2t(x2, x3, y2, y3);
        double c = rastoyanie2t(x3, x1, y3, y1);
        System.out.println("Координаты первой точки (" + x1 + ", " + y1 + ")");
        System.out.println("Координаты второй точки (" + x2 + ", " + y2 + ")");
        System.out.println("Координаты третьей точки (" + x3 + ", " + y3 + ")");
        System.out.println("Площадь треугольника = " + area(a, b, c));
    }

    static double rastoyanie2t(double k2, double k1, double ky2, double ky1){
        return Math.sqrt(Math.pow(k2 - k1, 2) + Math.pow(ky2 - ky1, 2));
    }

    static double rastoyanie(double k1, double ky1){
        return Math.sqrt(Math.pow(k1, 2) + Math.pow(ky1, 2));
    }

    static  double area(double a, double b, double c){
        double p = (a + b + c) / 2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
