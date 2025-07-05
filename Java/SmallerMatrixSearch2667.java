
import java.util.*;

public class SmallerMatrixSearch2667 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] bigMatrix = new int[N][N];
        int[][] smallMatrix = new int[M][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bigMatrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                smallMatrix[i][j] = sc.nextInt();
            }
        }

        boolean found = false;
        outerloop:
        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j <= N - M; j++) {
                boolean match = true;
                for (int k = 0; k < M; k++) {
                    for (int l = 0; l < M; l++) {
                        if (bigMatrix[i + k][j + l] != smallMatrix[k][l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    found = true;
                    break outerloop;
                }
            }
        }

        System.out.println(found ? "TRUE" : "FALSE");
        sc.close();
    }
}
