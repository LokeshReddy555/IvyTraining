package daytwo;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStudents = sc.nextInt();
        int marks[] = new int[noOfStudents];
        int maxMarks = Integer.MIN_VALUE, minMarks = Integer.MAX_VALUE;
        for(int i=0;i<noOfStudents;i++) {
            marks[i] = sc.nextInt();
            maxMarks = Math.max(maxMarks, marks[i]);
            minMarks = Math.min(minMarks, marks[i]);
        }
        System.out.println("Maximum marks : "+maxMarks);
        System.out.println("Minimum marks : "+minMarks);
    }
}
