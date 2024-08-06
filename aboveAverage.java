import java.text.DecimalFormat;
import java.util.Scanner;

public class aboveAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int C = s.nextInt();
        for (int i = 0; i < C; i++) {
            int N = s.nextInt();
            int sum = 0;
            int[] grades = new int[N];

            for (int j = 0; j < N; j++) {
                grades[j] = s.nextInt();
                sum += grades[j];
            }

            int average = sum / N;
            int counter = 0;
            for (int k = 0; k < N; k++) {
                if (grades[k] > average)
                    counter++;
            }

            float exactValue = (float) counter / N * 100.0F;
            DecimalFormat df = new DecimalFormat("0.000");
            System.out.println(df.format(exactValue) + "%");
        }
    }
}
