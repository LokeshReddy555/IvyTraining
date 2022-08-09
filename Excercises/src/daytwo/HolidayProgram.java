package daytwo;

public class HolidayProgram {
    public static void main(String[] args) {
        Holiday instanceOne = new Holiday("Independence Day",4,"July");
        Holiday instanceTwo = new Holiday("Republic Day",26,"January");
        System.out.println(Holiday.inSameMonth(instanceOne,instanceTwo));
    }
}
class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public static boolean inSameMonth(Holiday instanceOne, Holiday instanceTwo) {
        return instanceOne.month == instanceTwo.month;
    }

    public static double avgDate(Holiday[] array) {
       double sum = 0.0;
        for(int i=0;i<array.length;i++) {
            sum += array[i].day;
        }
        return sum/array.length;
    }
}

