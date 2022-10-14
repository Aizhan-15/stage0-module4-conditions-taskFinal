package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0)
            System.out.println(0);
        else if (x > 0 && y > 0)
            System.out.println(1);
        else if (x < 0 && y > 0)
            System.out.println(2);
        else if (x < 0 && y < 0)
            System.out.println(3);
        else if (x > 0 && y < 0)
            System.out.println(4);
        System.out.println(-1);
        int ret = 0;
    }
}
