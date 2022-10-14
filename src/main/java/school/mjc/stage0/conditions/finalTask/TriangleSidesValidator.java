package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double firstSide1 = 2;
        double secondSide1 = 4;
        double thirdSide1 = 6;
        if (firstSide1 + secondSide1 > thirdSide1 && firstSide1 + thirdSide1 > secondSide1 && secondSide1 + thirdSide1 > firstSide1) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
