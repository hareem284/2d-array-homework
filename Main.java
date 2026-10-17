
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int min = a[i][0];
            int col = 0;

            for (int j = 1; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    col = j;
                }
            }

            boolean saddle = true;

            for (int j = 0; j < n; j++) {
                if (a[j][col] > min) {
                    saddle = false;
                }
            }

            if (saddle) {
                System.out.println(min);
                return;
            }
        }

        System.out.println("No saddle price");
    }
}
