package Recursion;

//find x raise to power n
public class xPowern {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xn = x * power(x, n - 1);
        return xn;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
    }

}
