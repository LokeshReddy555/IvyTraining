import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {              //rows
            for (int j = 0; j < n; j++) {          //columns
                if (j <= i) {
                    System.out.print(ch1 + " ");
                } else {
                    System.out.print(ch2 + " ");
                }
            }
            System.out.println();
        }
    }
}
