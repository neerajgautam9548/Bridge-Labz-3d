package prac.Level3;

public class q9 {
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    static void printCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) days[2] = 29; else days[2] = 28;

        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M  T  W  T  F  S");

        int d = dayOfWeek(1, month, year);

        for (int i = 0; i < d; i++) System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%3d", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }
    }

    public static void main(String[] args) {
        printCalendar(7, 2005);
    }
}
