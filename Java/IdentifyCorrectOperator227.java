
import java.util.*;

public class IdentifyCorrectOperator227 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[\\+\\-\\*\\/\\=]");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int z = Integer.parseInt(str[2]);
        if (x + y == z) {
            System.out.print("+");
        } else if (x - y == z) {
            System.out.print("-");
        } else if (x * y == z) {
            System.out.print("*");
        } else {
            System.out.print("/");
        }

    }
}
