package Recursion;

//fibonacci series - mtlb pichle 2 number ka sum next number bnata h and yhi process chlta rhta h
// 0 1 1 2 3 5 8 13 .........
// and one thing we know in this case is -- 0th fibonacci number is 0 and 1st fibonacci number is 1.
// so, from above the equation comes out is ->  f2 = f1 + f0 
// that means .... fn = f(n-1) + f(n-2)

public class nthFibonacciNo {

    // calculating nth fibonacci number
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { // base case
            return n;
        }

        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;

    }

    public static void main(String[] args) {
        int n = 6;                                 //8
        System.out.println(fibonacci(n));
    }
}
