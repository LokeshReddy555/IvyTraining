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
        System.out.println(mode(array));
    }
    public static float mean(int[] array) {
        float mean = 0, sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        mean = sum/array.length;
        return mean;
    }
    public static int mode(int[] array) {
        int mode = 0, mostRepeating = 0;
        int numbers[] = new int[10]; //considering 0 to 9 i/p numbers in array
        for(int i=0;i<array.length;i++) {
            numbers[array[i]]++;
            if(numbers[array[i]] > mostRepeating) {
                mostRepeating = numbers[array[i]];
                mode = array[i];
            }
        }
        return mode;
    }
}
