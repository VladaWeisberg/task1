package Project;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double r1, r2, r3, roundSect, donatSect_1, donatSect_2, angleSect;

        r1 = readDouble("r1");
        r2 = readDouble("r2");
        r3 = readDouble("r3");

        roundSect = readDouble("roundSect");
        donatSect_1 = readDouble("donatSect_1");
        donatSect_2 = readDouble("donatSect_2");
        angleSect = readDouble("angleSect");

        double areaAngle = sectorsArea(squareArea(r3), circleArea(r3), angleSect);
        double areaDonat2 = sectorsArea(circleArea(r3), circleArea(r2), donatSect_2);
        double areaDonat1 = sectorsArea(circleArea(r2), circleArea(r1), donatSect_1);
        double areaRound = sectorsArea(circleArea(r1), 0, roundSect);

        double area = areaAngle + areaDonat2 + areaDonat1 + areaRound;

        System.out.print("Area = " + area);
    }

    private static double circleArea(double r) //вычисляет площадь круга
    {
        return Math.PI * r * r;
    }

    private static double squareArea(double r) //вычисляет площадь квадрата, когда в него вписан круг радиусом r
    {
        double d = 2 * r;
        return d * d;
    }

    private static double sectorsArea(double area1, double area2, double sectorsCount) //вычисляет площадь секторов в заданной фигуре
    {
        return sectorsCount * (area1 - area2)/8;
    }

    public static double readDouble(String name)
    {
        System.out.printf("Input %s = ", name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
