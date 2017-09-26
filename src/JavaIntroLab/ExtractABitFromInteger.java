package JavaIntroLab;

import java.util.Scanner;

public class ExtractABitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int p = Integer.parseInt(scanner.next());

        int mask = n >> p;
        int bit = mask & 1;

        System.out.println(bit);
    }
}
