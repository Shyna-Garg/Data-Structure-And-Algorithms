package Recursion;

//Friends Pairing Problem
// Given n friends, each one can reamin single or can be paired up with some other friend. Each friend can be paired only once. Find out
// the total number of ways in which friends can remain single or can be paired up.

public class Pairing {

    public static int pairingProblem(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        
        // choice

        // single
        int fnm1 = pairingProblem(n - 1);
        // pair
        int fnm2 = pairingProblem(n - 2);
        int pairWays = (n - 1) * fnm2;
        // total ways
        int totalWays = pairWays + fnm1;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(pairingProblem(3));
    }

}
