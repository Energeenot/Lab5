package Lab5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[90];
        double[] array_sq = new double[30];
        double[] array_per = new double[30];
        int a = 1;
        int b = 1;
        double angle = 1;
        for (int i = 0; i < 90; i++){
            System.out.println("Введите значения длин сторон параллелограмма и угла между ними");
            a = scanner.nextInt();
            b = scanner.nextInt();
            angle = scanner.nextDouble();
            array[i] = a;
            i++;
            array[i] = b;
            i++;
            array[i] = angle;
            for (int j = 0; j < 30; j++){
                array_sq[j] = square(a, b, angle);
                array_per[j] = perimeter(a, b);
            }
        }
        double naimp = 1000000000;
        int count = 0;
        for (int i = 0; i < 30; i++){
            if (array_per[i] < naimp){
                naimp = array_per[i];
            }
            if (array_sq[i] > 10){
                count++;
            }
        }
        double sum = array_per[0] + array_sq[29];
        System.out.println("Наименьший из периметров " + naimp + ", количество площадей больших 10 =  " + count + ", сумма периметра первого и площади последнего параллелограмма " + sum);
    }

    static  double square(int a, int b, double angle){
        return a * b * Math.sin(angle);
    }

    static int perimeter(int a, int b){
        return 2 * (a + b);
    }
}
