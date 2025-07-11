class Solution {

  public static void sortColors(int[] nums) {
    int temp;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

   
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println(); // for clean line break
  }

  public static void main(String[] args) {
    int nums[] = {2, 1 ,0 , 2, 1};
    sortColors(nums); 
  }
}

//output--> 0 1 1 2 2