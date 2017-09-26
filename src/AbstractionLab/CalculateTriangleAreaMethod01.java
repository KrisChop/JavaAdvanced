package AbstractionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CalculateTriangleAreaMethod01 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double side = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        double area = getArea(side , height);
        System.out.printf("%.2f",area);
    }

    private static double getArea(double side, double height) {
        return (side * height) / 2;
    }
}
