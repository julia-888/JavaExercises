package tenth;

import java.util.Scanner;

public class Tenth {
    static int reverse(int n, int nr){
        nr = nr*10 + (n%10);
        n /= 10;
        return (n == 0)?nr:reverse(n, nr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.nextInt(), 0));
    }
}
