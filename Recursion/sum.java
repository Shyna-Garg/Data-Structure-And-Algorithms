package Recursion;

public class sum {
//sum of natural numbers
    public static int sumPrinting(int n){
        if(n==0){
            return 0;
        }
        int Sn = n + sumPrinting(n-1);
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;      
        System.out.println(sumPrinting(n)); 
    }
}
