import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] A = new int[33];
        int[] B = new int[33];
        a = a.toUpperCase();
        b = b.toUpperCase();
        for (int i = 0; i < a.length(); i ++) {
            A[a.charAt(i) - 'A'] ++;
        }
        for (int i = 0; i < b.length(); i ++) {
            B[b.charAt(i) - 'A'] ++;
        }
        for (int i = 0; i < 26; i ++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}