package JavaIntroEx;

import java.util.Scanner;

public class GetFirstOddorEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        String[] commands = scanner.nextLine().split(" ");

        int counter=0;
        if (commands[2].equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) % 2 != 0 && counter < Integer.parseInt(commands[1])) {
                        System.out.print(numbers[i]+" ");
                    counter++;
                }
            }
        }else if (commands[2].equals("even")){
            for (int i = 0; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) % 2 == 0 && counter < Integer.parseInt(commands[1])){
                    System.out.print(numbers[i]+" ");
                    counter++;
                }
            }
        }
    }
}
