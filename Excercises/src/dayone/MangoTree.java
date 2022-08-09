package dayone;

import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int target = sc.nextInt();

        //first row, first column, last column - Mango tree exists
        if (target > 0 && target <= rows) {      //first row
            System.out.println("yes");
        } else if (target % cols == 1 && target < rows * cols) {            //first column
            System.out.println("yes");
        } else if (target % cols == 0 && target < rows * cols) {            //last column
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
