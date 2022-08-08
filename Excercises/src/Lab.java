import java.util.*;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        int lab1 = x-n;
        int lab2 = y-n;
        int lab3 = z-n;

        //cases if they are not suitable
        if(lab1 < 0) {
            lab1 = Integer.MAX_VALUE;
        }
        if(lab2 < 0) {
            lab2 = Integer.MAX_VALUE;
        }
        if(lab3 < 0) {
          lab3 = Integer.MAX_VALUE;
        }

        //checking which is more suitable
        if(lab1 != Integer.MAX_VALUE && lab1<=lab2 && lab1<=lab3) {
            System.out.println("L1");
        }
        else if(lab2 != Integer.MAX_VALUE && lab2<=lab3 && lab2<=lab1) {
            System.out.println("L2");
        }
        else if(lab3 != Integer.MAX_VALUE && lab3<=lab1 && lab3<=lab2) {
            System.out.println("L3");
        }
        else {
            System.out.println("No lab is suitable");
        }
    }
}
