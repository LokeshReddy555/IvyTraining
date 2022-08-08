import java.util.*;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {          //if n is even
                n = n / 2;
            } else {                  //if n is odd
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
}
