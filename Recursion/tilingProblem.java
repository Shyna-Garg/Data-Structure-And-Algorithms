package Recursion;

//Given '2 cross n' board and tiles of size '2 cross 1' , count the number of ways to tile the given board using '2 cross 1' tiles.
//A tile can either be placed horizontally or vertically. 

public class tilingProblem {

    public static int tiles(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // horiontal choice
        int fnm2 = tiles(n - 2);

        // vertical choice
        int fnm1 = tiles(n - 1);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(tiles(4));            //5
    }
}
