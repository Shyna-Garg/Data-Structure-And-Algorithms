package Recursion;

//to print all the index of the occurences of key in given array 
public class printAllOccurences {
    public static void allOccurences(int arr[], int key, int i,boolean found) {
        if (i == arr.length) {
            if(!found){
            System.out.println("key not found");
            }
            return;
        }
         if (key == arr[i]) {
            System.out.println(i);
            found = true;
            
        }
     allOccurences(arr, key, i + 1,found);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 5, 4, 6, 5,3 };               // 2 4 7
     allOccurences(arr, 5, 0,false);
    }

}
