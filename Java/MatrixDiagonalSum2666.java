
import java.util.*;

public class MatrixDiagonalSum2666 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i][i];
            if (i != N - 1 - i) {
                sum += arr[i][N - 1 - i];
            }

            System.out.println(sum);
            sc.close();
        }
    }
}
