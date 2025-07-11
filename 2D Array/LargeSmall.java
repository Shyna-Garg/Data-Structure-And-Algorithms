// to find largest and smallest element in matrix

public class LargeSmall {

  public static void largeSmall(int matrix[][]) {

    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (largest < matrix[i][j]) {
          largest = matrix[i][j];
        }
        if (matrix[i][j] < smallest) {
          smallest = matrix[i][j];
        }
      }
    }
    System.out.println("largest number is:" + largest);
    System.out.print("smallest number is:" + smallest);

  }

  public static void main(String[] args) {

    int matrix[][] = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    largeSmall(matrix);

  }
}