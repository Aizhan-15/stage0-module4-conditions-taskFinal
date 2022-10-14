package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int quotient;
        if (divider == 0.0) {
            throw new IllegalArgumentException("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
