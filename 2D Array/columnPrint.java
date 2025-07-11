//column wise printing 

public class columnPrint {

  public static void columnwisePrint(int matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {

        matrix[i][j] = matrix[j][i];

        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    columnwisePrint(matrix);
  }
}

/*
 o/p -->
 1 4 7
 2 5 8
 3 6 9
 */