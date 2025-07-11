public class sumOfRowColumn {

    public static void rowColSum(int matrix[][]) {

        // row sum

        for (int i = 0; i < matrix.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowsum += matrix[i][j];
            }
            System.out.println("row:" + i + " " + "sum:" + rowsum);
        }

        System.out.println();

        // column sum

        for (int j = 0; j < matrix[0].length; j++) {
            int colsum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colsum += matrix[i][j];
            }
            System.out.println("col:" + j + " " + "sum:" + colsum);
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 2, 1, 3 }
        };

        rowColSum(matrix);
    }
}
