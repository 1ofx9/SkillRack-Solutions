
import java.util.*;

public class CountOfCommonCharactersInTwoStrings210 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        List<Character> l1 = new ArrayList<>();
        for (char ch : s1.toCharArray()) {
            l1.add(ch);
        }

        int count = 0;
        for (char ch : s2.toCharArray()) {
            if (l1.contains(ch)) {
                count++;
                l1.remove((Character) ch);
            }
        }

        System.out.println(count);
        sc.close();
    }
}
