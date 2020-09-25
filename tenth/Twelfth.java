package tenth;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        while (a != 0){
            if (a%2 != 0){
                System.out.println(a);
            }
            a = in.nextInt();
        }
    }
}
