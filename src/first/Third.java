package first;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] a = new int[]{1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i=0; i < 10; i++){
            sum += a[i];
        }
        System.out.println("Сумма элементов массива(посчитано циклом for):" + sum);

        sum =0;
        int i=0;
        while (i < 10){
            sum += a[i];
            i++;
        }
        System.out.println("Сумма элементов массива(посчитано циклом while):" + sum);

        sum =0;
        i=0;
        do{
            sum += a[i];
            i++;
        }while(i < 10);
        System.out.println("Сумма элементов массива(посчитано циклом do-while):" + sum);

    }
}
