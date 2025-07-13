package Strings;

public class StringBuilders {

    public static void main(String[] args) {

        // intialization
        StringBuilder sb = new StringBuilder();

        // append
        sb.append("Hello");
        sb.append(" World");

        // insert
        sb.insert(5, ",");

        // delete
        sb.delete(5, 6);

        // replace
        sb.replace(0, 5, "Hi");

        // reverse
        sb.reverse();

        // convert to string
        String result = sb.toString();

        System.out.println(result); // Output: dlroW ,iH

        // let's say i want to print a to z
        StringBuilder sb2 = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb2.append(ch);
        }
        System.out.println(sb2); // Output: abcdefghijklmnopqrstuvwxyz

    }
}