package first;

public class Seventh {
    static long factorial(int n){
        long l = 1;
        for (int i=2; i <= n; i++){
            l *= i;
        }
        return l;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }
}
