public class diagonalSum {
    
//brute force approach

  public static int bfDiagonalSum(int matrix[][]){
        int sum=0;
        for (int i =0 ; i<matrix.length ; i++){
            for (int j=0; j<matrix[0].length;j++){
                if(i==j){
                    sum+= matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    //optimized approach

    public static int optimizedDiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length;i++){
            sum+=matrix[i][i];
            if (i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}                    
    };
    int result = bfDiagonalSum(matrix);
        System.out.println("Sum of diagonals: " + result);

        int result1= optimizedDiagonalSum(matrix);
        System.err.print("Sum of diagonals:"+ result1);
    }
}
