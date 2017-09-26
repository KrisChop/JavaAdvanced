package JavaIntroLab;

import java.util.Locale;
import java.util.Scanner;

public class ReadInput01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();

        Integer firstNumber = scanner.nextInt();
        Double secondNumber = scanner.nextDouble();
        Double thirdNumber = scanner.nextDouble();

        String thirdWord = scanner.next();
        double sum = firstNumber+ secondNumber + thirdNumber;

        System.out.println(firstWord +" "+ secondWord + " "+ thirdWord + " " + (int)sum );
    }
}