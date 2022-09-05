package Lab5;


import java.util.Scanner;

public class clwt4 {
    public static void main(String[] args) {
        System.out.println("Пункт а:");
        kv4x4();
        System.out.println("Пункт b:");
        System.out.println("ведите размер стороны квадрата");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        kvnxn(n);
        System.out.println("Пункт c:");
        System.out.println("Введите величину отступа");
        int m = scanner.nextInt();
        kvm(m, n);
        System.out.println("Пункт d:");
        chess(m, n);

    }
    static void kv4x4(){
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("****");
    }

    static void kvnxn(int n){
        for (int i = 0; i < n; i++){
            if (i != 0 && i != n-1){
                for (int j = 0; j < n; j++){
                    if (j == 0 || j == n-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else {
                System.out.println(String.format("%" + n + "s", "*").replace(' ', '*'));
            }
        }
    }
    static void kvm(int m, int n){
        for (int i = 0; i < n; i++){
            if (i != 0 && i != n-1){
                for (int j = 0; j < n; j++){
                    if (j == 0){
                        System.out.print(String.format("%" + m + "s", " ").replace(' ', ' ') + "*");
                    }
                    if (j == n-2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else {
                System.out.println(String.format("%" + m + "s", " ").replace(' ', ' ') + String.format("%" + n + "s", "*").replace(' ', '*'));
            }
        }
    }
    static void chess(int m, int n){
        int k = m;
        int g = n;
        for (int i = 0; i < n * m; i++){
            for (int j = 0; j < n * m; j++){
                if (i % 2 == 0 && j % 2 == 0) {
                    if (i < k && j < g) {
                        System.out.print(String.format("%" + m + "s", "/").replace(' ', '/'));
                        k++;
                        g++;
                    }
                }

                if (i % 2 != 0 && j % 2 != 0) {
                    if (i < m && j < m) {
                        System.out.print(String.format("%" + m + "s", "/").replace(' ', '/'));
                    }
                }
                if (i % 2 != 0 && j % 2 == 0) {
                    if (i < m && j < m) {
                        System.out.print(String.format("%" + m + "s", " ").replace(' ', ' '));
                    }
                }
                if (i % 2 == 0 && j % 2 != 0) {
                    if (i < m && j < m) {
                        System.out.print(String.format("%" + m + "s", " ").replace(' ', ' '));
                    }
                }

            }
            System.out.println();
        }
        }
}
