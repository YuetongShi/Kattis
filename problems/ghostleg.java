package Trees;
import java.util.*;

public class ghostLeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] columns = new int[n + 1];
        int[] rows = new int[m];
        columns[0] = -1;
        for (int i = 0; i < m; i++) {
            rows[i] = s.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int position = i;
            for (int r : rows){
                if (r == position)
                    position ++;
                else if (r == position -1)
                    position --;
            }
            columns[position] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(columns[i]);
        }
    }
}
