package daytwo;

import java.util.Scanner;

public class MeanModeMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        int array[] = new int[noOfElements];
        for(int i=0;i<noOfElements;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(mean(array));
    }
    public static float mean(int[] array) {
        float mean = 0, sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        mean = sum/array.length;
        return mean;
    }
}
