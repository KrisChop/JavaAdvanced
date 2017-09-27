package AbstractionLab;

import java.math.BigInteger;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        BigInteger[][] pascal = new BigInteger[size][];

        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new BigInteger[i + 1];
        }

        pascal[0][0] = BigInteger.ONE;

        for (int row = 1; row < pascal.length; row++) {
            pascal[row][0] = BigInteger.ONE;
            pascal[row][pascal[row].length - 1] = BigInteger.ONE;

            for (int col = 1; col < pascal[row].length - 1; col++) {
                pascal[row][col] = pascal[row - 1][col - 1].add(pascal[row - 1][col]);
            }
        }

        for (BigInteger[] longs : pascal) {
            for (BigInteger aLong : longs) {
                System.out.print(aLong + " ");
            }
            System.out.println();
        }
    }
}