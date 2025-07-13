package Strings;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {

        String str1 = "racer";
        String str2 = "carer";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        if (str1Array.length != str2Array.length) {
            System.out.println("not anagram");
            return;
        } else {

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            if (Arrays.equals(str1Array, str2Array)) {
                System.out.println("yes , anagram");
            } else {
                System.out.println("not anagram");

            }

        }

    }

}
