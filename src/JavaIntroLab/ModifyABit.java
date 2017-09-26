package JavaIntroLab;

import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int p = Integer.parseInt(scanner.next());
        int v = Integer.parseInt(scanner.next());

        if (v == 0) {
            int mask = ~(1 << p);
            int result = n & mask;

            System.out.println(result);
        }else {
            int mask = 1 << p;
            int result = n | mask;

            System.out.println(result);
        }
    }
}
