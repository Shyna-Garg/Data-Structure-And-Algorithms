package Bit_Manipulation;

public class addOne {
    // adding 1 to the number using NOT opeerator
    /*
       n = 5
      ~ n = -6
      -(~n) = 6
      
     */
    public static void addOneUsingNOT(int n) {
        int result = -(~n);
        System.out.println(result);
    }

    // adding 1 using AND and XOR
    public static void addOneUsingANDandXOR(int num,int carry) {

        while (carry != 0) {
            int sum = num ^ carry;
            carry = (num & carry) << 1;
            num = sum;
        }
        System.out.println(num);
 
    }

    public static void main(String[] args) {
        addOneUsingNOT(5);      //6
        addOneUsingANDandXOR(5,1);   //6
    }
}
