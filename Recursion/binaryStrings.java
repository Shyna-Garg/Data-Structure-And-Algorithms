package Recursion;

//print all binary strings of size N without consecutive ones.
public class binaryStrings {

    public static void printBinaryStrings(int n, int lastPlace , String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lastPlace == 0){
            printBinaryStrings(n-1, 0, str+"0");
            printBinaryStrings(n-1, 1, str+"1");

        }
        else if (lastPlace==1){
            printBinaryStrings(n-1, 0, str+"0");
        }

    }


    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
    
}
