package Bit_Manipulation;

public class isNoPowerOf2 {

    /*
    n = 8 ->   1 0 0 0                    ,                     n = 3 ->   0 1 1
    n-1=7 -> & 0 1 1 1                                          n-1=2 -> & 0 1 0                        
             -----------                                                -----------
               0 0 0 0                                                     0 1 0
             -----------                                                ------------
    yes , n is power of 2                                             not equal to 0, so n is not power of 2

     */

    public static boolean isNumberPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPowerOfTwo(112)); // false
        System.out.println(isNumberPowerOfTwo(8)); // true
    }
}