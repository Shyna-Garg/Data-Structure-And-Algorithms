// tranpose of a matrix

public class transpose {

    public static void transposeOfMatrix(int matrix[][]) {

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2 },
                { 5, 6 },
                { 3, 1 } };
        transposeOfMatrix(matrix);
    }
}
