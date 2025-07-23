package Recursion;

//removing duplicates in a string
public class duplicates {

    public static void removeDuplicates(String str, int index, StringBuilder sb, boolean map[]) {
        if (index == str.length()) {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, index + 1, sb, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, sb.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "hehesiddo"; // hesido
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }

}
