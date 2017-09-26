package JavaIntroEx;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        String str1 = input[0];
        String str2 = input[1];

        int smaller = Math.min(str1.length(),str2.length());
        long totalSum =0;

            for (int i = 0; i < smaller; i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }

        if (str1.length() < str2.length()){

                for (int j = smaller; j < str2.length(); j++) {
                    totalSum += str2.charAt(j);
                }

        }else if(str1.length() > str2.length()) {

                for (int j = smaller; j < str1.length(); j++) {
                    totalSum += str1.charAt(j);
                }
            }

        System.out.println(Math.abs(totalSum));
    }
}
