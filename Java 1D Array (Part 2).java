import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        int[] chk = new int[n];
        Arrays.fill(chk, 0);
        Queue<Integer> Q = new LinkedList<>();
        Q.add(0);
        chk[0] = 1;
        while(Q.size() > 0) {
            int now = Q.poll();
            if (now == n - 1 || now + leap >= n) return true;
            if (game[now] == 0) {
                if (now > 0 && chk[now - 1] == 0 && game[now - 1] == 0) {
                    Q.add(now - 1);
                    chk[now - 1] = 1;
                }
                if (now + leap < n && chk[now + leap] == 0 && game[now + leap] == 0) {
                    Q.add(now + leap);
                    chk[now + leap] = 1;
                }
                if (now + 1 < n && chk[now + 1] == 0 && game[now + 1] == 0) {
                    Q.add(now + 1);
                    chk[now + 1] = 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
