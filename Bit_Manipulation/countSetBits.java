package Bit_Manipulation;

public class countSetBits {

    // count set bits in a number -- means count the number of 1 in given number

    /*
    count = 0
     n = 10--> 1010
     step 1 - checking LSB
         0 & 1 = 0
         count remains 0
         10>>1 -> 0101
      step 2 - LSB = 1
               1 & 1 = 1
               so count becomes 1
               0101 >> 1 -> 0010
       step 3 - LSB = 0
               0 & 1 = 0
              count remians same -- 1
              0010 >> 1 -> 0001
       step 4 - LSB = 1
                1 & 1 = 1
                count become 2
                0001 >> 1 -> 0000
       step 5 - loop ends          
     */

    public static int countingSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countingSetBits(15)); // 4
        System.out.println(countingSetBits(16)); // 1
    }
}