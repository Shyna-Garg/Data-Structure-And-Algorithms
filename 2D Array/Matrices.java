import java.util.*;

public class Matrices {

  // searching any key

  public static void search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {

        if (matrix[i][j] == key) {
          System.out.println("(" + i + "," + j + ")");
        }

      }
    }
  }

  // smallest and largest number

  public static void maxMin(int matrix[][]) {
    int max = matrix[0][0];
    int min = matrix[0][0];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {

        if (matrix[i][j] > max) {
          max = matrix[i][j];
        } else {
          System.out.println("smallest number is:" + min);
        }
      }
    }
    System.out.println("largest number is:" + max);
  }

  // main function

  public static void main(String args[]) {
    // input
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {

        matrix[i][j] = sc.nextInt();

      }
    }
    // output
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {

        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    search(matrix, 8);
    maxMin(matrix);

  }
}
