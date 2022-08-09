package daytwo;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        int length1 = string1.length();
        int length2 = string2.length();
        String concat = string1+string2;
        String reverse = reverse(concat);
        System.out.println("String1 length : "+ length1+ " String2 length : "+ length2);
        System.out.println("Merged String : "+ concat);
        System.out.println("Splitting string : "+ split(concat));
        System.out.println("Reversing string : "+ reverse);
        System.out.println("Checking 2 strings are equal or not : "+ string1.equals(string2));
    }
    public static String reverse(String concat) {
        String reverseString = "";
        for(int i=concat.length()-1;i>=0;i--) {
            reverseString += Character.toString(concat.charAt(i));
        }
        return reverseString;
    }
    public static String split(String concat) {
        String string1 = "", string2 = "";
        if(concat.length()%2 == 0) {
            string1 = concat.substring(0,concat.length()/2);
            string2 = concat.substring((concat.length()/2));
        }
        else {
            string1 = concat.substring(0,(concat.length()/2)+1);
            string2 = concat.substring((concat.length()/2)+1);
        }
        return string1+" "+string2;
    }
}
