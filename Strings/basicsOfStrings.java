package Strings;

import java.util.Scanner;

public class basicsOfStrings {

    // function to print all letters using charAt
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {

        // declaration - 2 methods
        String str = "abcd123#";
        String str1 = new String("xyz");

        // input - output
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        // length
        String Name = name;
        System.out.println("length of the string is:" + Name.length());

        // concatenation
        String firstName = "Siddo";
        String lastName = "Karn";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //comparison of strings
        if(firstName.equals(lastName)){
        System.out.println("equal");
        }
        else System.out.println("not equal");

        //substring
        System.out.println("substring:"+fullName.substring(0,4));

        // charAt Method
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }

}
