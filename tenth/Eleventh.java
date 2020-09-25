package tenth;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int previous = in.nextInt();
        int current = in.nextInt();
        int one = 0;

        while (previous != current || previous != 0){
            if (previous == 1){
                one ++;
            }
            previous = current;
            current = in.nextInt();
        }

        System.out.println(one);
    }
}
