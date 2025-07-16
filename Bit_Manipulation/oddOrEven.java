// Check if a number is odd or even 
// if LSB = 0 then number is even else odd.  LSB = 0 -> even ,  LSB = 1 -> odd
// So , we can do AND with 1 of given number bcz in AND operator only  1 1 -> 1 . So, if the last digit of given number is 1 then answer will give
//   1 on last and all the other digit as zero and vice-versa. If last digit is 0 the answer will give o on last and rest all digit also 0.
/*
6->0 1 1
 & 0 0 1
 ---------
   0 0 1
 ---------
*/

package Bit_Manipulation;

public class oddOrEven{
public static void isOddOrEven (int n){
    int bitmask = 1;
    if((n & bitmask) == 0){
        System.out.println("Number is even" +":" + n );
        
    }
    else System.out.println("Number is odd" +":" + n);
   
}

public static void main (String[] args){
isOddOrEven(6);

  
}
}
