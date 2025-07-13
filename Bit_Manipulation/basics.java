package Bit_Manipulation;
//Bitwise Operators

public class basics {
 
    public static void main (String[]args){
    // binary AND & -- 11 -> 1
    System.out.println(5 & 6);             //4
    
    //binary OR | -- 00 -> 0
    System.out.println(5 | 6);            //7

    //binary XOR ^ -- 01 , 10 -> 1
    System.out.println(5 ^ 6);           //3

    //binary 1s complement
    System.out.println(~5);             //-6
    
    //binary Left Shift <<
    System.out.println(5<<2);          //20

    //binary Right Shift >>
    System.out.print(6>>1);          //3

}
}
