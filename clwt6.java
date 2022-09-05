package Lab5;

import java.util.Random;
import java.util.Scanner;

public class clwt6 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Пункт а:");
        int[][] matrix = {{5, 7, 8, 9, 5, 9},
                          {5, 8, 2, 1, 3, 6},
                          {3, 8, 4, 7, 6, 9}};
        matrix_output(matrix, 6);
        System.out.println("Пункт b:");
        System.out.println("Введите количество строк");
        int i = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int j = scanner.nextInt();
        int[][] matrixb = new int[i][j];
        System.out.println("Введите элементы матрицы");
        matrix_keyb(matrixb, j);
        matrix_output(matrixb, j);
        System.out.println("Матрица заполненная случайными числами");
        random_matrix(matrix, j);
        matrix_output(matrix, j);
        System.out.println("Пункт c:");
        System.out.println(arithm_mean(matrix, j));
        System.out.println("Пункт d:");
        System.out.println(d(matrix, j));
        System.out.println("Пункт e:");
        System.out.println(e(matrix));
    }

    static void matrix_output(int[][] matrix, int l){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < l; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void matrix_keyb(int[][] matrixb, int l){
        for (int k = 0; k < matrixb.length; k++){
            for (int g = 0; g < l; g++){
                matrixb[k][g] = scanner.nextInt();
            }
        }
    }

    static void random_matrix(int[][] matrix, int l){
        Random random = new Random();
        for (int k = 0; k < matrix.length; k++){
            for (int g = 0; g < l; g++){
                matrix[k][g] = random.nextInt();
            }
        }
    }

    static double arithm_mean(int[][] matrix, int l){
        double arithm = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < l; j++){
                arithm += matrix[i][j];
            }
        }
        arithm = arithm / (matrix.length * l);
        return  arithm;
    }

    static int[] d (int[][] matrix, int j){
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = matrix[i][j];
        }
        return result;
    }

    static int[] e (int[][] matrix){
        int[] result = new int[5];
        int j =0;
        for(int i=0; i<5; i++){
            result[i] = matrix[i][j];
            j++;
        }
        return result;
    }
}
