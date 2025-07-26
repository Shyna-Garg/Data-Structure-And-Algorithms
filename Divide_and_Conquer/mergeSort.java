package Divide_and_Conquer;

//to sort an array
//in divide and conquer , firstly we divide the problem into smaller problems and solve these smaller problems and after solving them
//we conquer them means merge or we can say add the solution of the smaller problems and by this addition , we get our final solution.
public class mergeSort {

    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.err.println();
    }

    public static void MergeSort(int arr[], int si , int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid);              //left part
        MergeSort(arr, mid+1, ei);   //right part
        merge(arr, mid, si, ei);
    }

    public static void merge(int arr[],int mid, int si, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid & j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        //left part k bche hue elements
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part k bche hue elements
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //compy temp to original array
        for (k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
   public static void main(String[] args) {
    int arr[]= {8,2,4,9,6,-1,5};                          //-1 2 4 5 6 8 9 
    MergeSort(arr, 0, arr.length-1);
    printArr(arr);
   } 
}
