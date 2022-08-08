import java.util.Scanner;

public class WeeklyIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week[] = new int[7];
        int income[] = new int[7];
        int totalEarnings = 0, totalHrs = 0;
        //Weekly pay
        for(int i=0;i<7;i++) {
            week[i] = sc.nextInt();
            totalHrs += week[i];
            income[i] = week[i] * 100;   //regular pay
            if (week[i] > 8) {           // >8hrs then Rs.15/hr
                income[i] += (week[i] - 8) * 15;
            }
            if(i == 0) {                 //Sunday - 50% bonus
                income[i] += (income[i] * (0.5));
            }
            if(i == 6) {                 //Saturday - 25% bonus
                income[i] += (income[i] * (0.25));
            }
            totalEarnings += income[i];
        }
        if(totalHrs > 40) {              // >40hrs then Rs.25/hr
            totalEarnings += (totalHrs-40)*25;
        }
        System.out.println(totalEarnings);
    }
}
