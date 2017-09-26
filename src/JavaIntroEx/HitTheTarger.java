package JavaIntroEx;

import java.util.Scanner;

public class HitTheTarger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {

                if (i + j == sum || j + i == sum ){
                System.out.println(i + " + " + j + " = " + sum);
                }else if (i - j == sum){
                    System.out.println(i + " - " + j + " = " + sum);
                }

            }
        }
    }
}
