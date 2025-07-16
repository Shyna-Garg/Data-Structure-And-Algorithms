package Bit_Manipulation;

public class swapOfTwoNo {

    //swapping of two numbers without using third variable or any extra space

    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        /* Step 1 
        a = 0 1 0 1
        b = 1 0 0 1
     a^b= -----------
     a=     1 1 0 0
          ----------
         */                                                    
        a = a ^ b;                                                               

        /*Step 2
        a = 1 1 0 0
        b = 1 0 0 1
     a^b= ----------
     b=     0 1 0 1     = a
         -----------   
        
        */ 
        b = a ^ b;

        /*Step 3
        a = 1 1 0 0
        b = 0 1 0 1
    a^b= ------------
     a=     1 0 0 1      = b
         ------------     
        */ 
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

