package JavaIntroEx;

import java.util.Locale;
import java.util.Scanner;

public class RectangleArea01 {

    public static void main(String[] args) {

         Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double area = a*b ;

        System.out.printf("%.2f", area);
    }
}
