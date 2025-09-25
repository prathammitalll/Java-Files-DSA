public class RecursionPart2 {
    // TODO: Tiling Problem: Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles. (A tile can either be placed horizontally or vertically...
    public static int tilingProblem(int n) { // 2 x n (floor size)
        if (n==0 || n==1) return 1;

        // vertical choice
        int fnm1 = tilingProblem(n-1);
        // horizontal choice
        int fnm2 = tilingProblem(n-2);
        
        int totWays = fnm1 + fnm2;
        return totWays;
        
    }

    public static void removeDuplicatesInString(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr); 
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar-'a']==true) {
            removeDuplicatesInString(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicatesInString(str, idx+1, newStr.append(currChar), map); 
        }
    }

// TODO: Friends Pairing Problem

// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

    public static int friendsPairingProb(int n) { // Formula: f(n-1) + (n-1) * f(n-2)
        if (n==1 || n==2) return n;

        return friendsPairingProb(n-1) + ((n-1) * friendsPairingProb(n-2));
    }

     // TODO: Binary Strings Problem
     // Print all binary strings of size N without consecutive ones

     public static void binaryStrings(int n, int lastPlace, String str) {
        // base case 
        if (n==0) {
            System.out.println(str);
            return;
        }
        
        binaryStrings(n-1, 0, str+"0");
        if (lastPlace == 0) { 
            binaryStrings(n-1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        // System.out.println(tilingProblem(3));
        // StringBuilder sb = new StringBuilder("");
        // boolean map[] = new boolean[26];
        // removeDuplicatesInString("programming", 0, sb, map);
        // System.out.println(friendsPairingProb(3));
        binaryStrings(3, 0, new String(""));
    }
}
