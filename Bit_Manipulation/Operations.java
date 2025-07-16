package Bit_Manipulation;

public class Operations {

    // get ith bit
    public static int getIthBit(int n, int i) {

        int bitmask = 1;

        if (((n >> i) & bitmask) == 0)
            return 0;
        else
            return 1;

    }

    // set ith bit -- 0 h toh 1 bna do , 1 h toh no change
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;

        return (n | bitmask);

    }

    // clear ith bit -- 1 h toh 0 bna do , 0 h toh no change
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // update ith bit -- 1 h toh 0 bna do and vice-versa.\
    public static int updateIthBit(int n, int i, int Bit) {
        int bitmask = 1 << i;
        if (Bit == 0) {
            int newBitmask = ~(bitmask);
            return n & newBitmask;
        } else {
            return n | bitmask;
        }
    }

    //clear last i  bits
     public static int clearLastIBits(int n, int i) {
     int bitmask = (~0)<<i;
       return n & bitmask;
     }

    //clear i to j range of bits means set as 0
         public static int clearRangeOfBits(int n, int i , int j) {
            int a = ((~0)<<(j+1));
            int b = (1<<i)-1;
            int bitmask = a | b;
            return n & bitmask;
         }


    public static void main(String[] args) {

        System.out.println(getIthBit(6, 1)); // 1
        System.out.println(setIthBit(6, 0)); // 7
        System.out.println(clearIthBit(10, 1)); // 8
        System.out.println(updateIthBit(5, 1, 1)); // 7
        System.out.println(clearLastIBits(15, 2));   //12
        System.out.println(clearRangeOfBits(10, 2, 4));  //2
    }

}
