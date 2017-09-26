package JavaIntroEx;

import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();
        //((a2 + b2) / (a2 – b2))(a + b + c) / √c
        double f1 = Math.pow((Math.pow(firstNum,2)+Math.pow(secondNum,2))/(Math.pow(firstNum,2)-(Math.pow(secondNum,2)))
                , (firstNum+secondNum+thirdNum)/Math.sqrt(thirdNum));

        //(a2 + b2 - c3)(a – b)
        double f2 = Math.pow(Math.pow(firstNum,2)+ Math.pow(secondNum,2) - Math.pow(thirdNum,3),firstNum-secondNum);

        double diff = Math.abs(((firstNum + secondNum + thirdNum)/3) - ((f1+f2)/2));
        System.out.printf("F1 result: %.2f; ", f1);
        System.out.printf("F2 result: %.2f; ", f2);
        System.out.printf("Diff: %.2f", diff);
    }
}
