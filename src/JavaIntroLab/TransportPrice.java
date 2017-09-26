package JavaIntroLab;

import java.util.Locale;
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double distance = Double.parseDouble(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double sum = 0;

        if (distance < 20){
            sum = 0.70;
            if ("day".equals(dayOrNight)){
                sum += distance * 0.79;
            }else {
                sum += distance * 0.90;
            }
        }else if (distance >= 20 && distance <= 100 ){
            sum = distance * 0.09;
        }else {
            sum = distance * 0.06;
        }

        System.out.printf("%.2f", sum);
    }
}
