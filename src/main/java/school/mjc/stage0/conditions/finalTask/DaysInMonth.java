package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            System.out.println("31");
        }
        if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30");
        if (month != 2)
            System.out.println("-1");
        if (year > 1582) {
            if (month % 4 == 0 && (month % 100 != 0 || month % 400 == 0))
                System.out.println("29");
            else
                System.out.println("28");

        }
    }

}

