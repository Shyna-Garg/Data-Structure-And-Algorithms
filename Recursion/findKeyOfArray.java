package Recursion;

//finding key of array when the element is first occured
//example -- array-> [1,2,3,4,6,7,9,4]
//so , here 4 occurs two time..but according to question we have to find first occurence..so answer will be 3 not 7
public class findKeyOfArray {

    public static int firstOccurenceKey(int arr[],int i,int key){
        if(i == arr.length){
            System.out.println("key not found");
        }

        if(key == arr[i]){
            return i;
        }
        return firstOccurenceKey(arr, i+1, key);
    }
    

    //now, we are writing function to find last occurence of key
    public static int lastOccurenceKey(int arr[], int i, int key){
        if(i < 0){
            System.out.println("key not found");
        }

        if(key == arr[i]){
            return i;
        }
        return lastOccurenceKey(arr, i-1 , key);
    }



    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7,8,5,7};
        System.out.println(firstOccurenceKey(arr, 0  , 5));               //3
        System.out.println(lastOccurenceKey(arr, arr.length-1  , 5));       //6
    }
}
