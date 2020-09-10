package first;

import java.util.*;

public class Sixth {
    public static void main(String[] args) {
        int a = -2147483648; // Начальное значение диапазона - "от"
        int b = 2147483647; // Конечное значение диапазона - "до"

        int [] arr = new int[10];
        int i=0;

        while (i < 5){
            arr[i] = a + (int) (Math.random() * b);
            i++;
        }

        Random r  = new Random();

        while (i < 10){
            arr[i] = r.nextInt();
            i++;
        }

        System.out.print("Массив из случайных чисел:");

        for (int j=0; j < 10; j++){
            System.out.print(" " + arr[j]);
        }

        Arrays.sort(arr);

        System.out.print("\nОтсортированный массив:");
        for (int j=0; j < 10; j++){
            System.out.print(" " + arr[j]);
        }
    }
}
