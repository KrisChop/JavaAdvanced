package JavaIntroLab;

import java.util.Locale;
import java.util.Scanner;

public class AverageNumberOfThree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        double average = (firstNum + secondNum + thirdNum) / 3;

        System.out.printf("%.2f", average);
    }
}
