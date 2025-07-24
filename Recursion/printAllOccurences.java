package Recursion;

//to print all the index of the occurences of key in given array 
public class printAllOccurences {
    public static int allOccurences(int arr[], int key, int i) {
        if (i == arr.length) {
            System.out.println("key not found");
        }
        if (key == arr[i]) {
            return i;
            
        }
        return allOccurences(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 5, 4, 6, 5 };
        System.out.println(allOccurences(arr, 5, 0));
    }

}
