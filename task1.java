package Lab5;

public class task1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        degree(array, 20);
    }

    static void degree(int[] array, int n){
        int result = 1;
        for (int i = 0; i < n; i++){
            result *= 2;
            array[i] = result;
        }
        for( int j = 0; j < 20; j++){
            System.out.print(array[j] + " ");
        }
    }
}
