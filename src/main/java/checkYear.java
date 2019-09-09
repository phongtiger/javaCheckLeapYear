import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        if (check(year)) {
            System.out.println(year+" is leap year!");
        } else {
            System.out.println(year+" is NOT leap year!");
        }
    }

    public static boolean check(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear =  true;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }
}
