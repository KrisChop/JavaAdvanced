package JavaIntroEx;

import java.util.Scanner;

public class OddandEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

      if (input.length %2 == 0){
          for (int i = 0; i < input.length; i+=2) {

              if (Integer.parseInt(input[i]) % 2 == 0 && Integer.parseInt(input[i+1]) % 2 == 0 ){
                  System.out.println(input[i]+", "+input[i+1] + " -> both are even");

              }else if (Integer.parseInt(input[i]) % 2 != 0 && Integer.parseInt(input[i+1]) % 2 != 0){
                  System.out.println(input[i]+", "+input[i+1] + " -> both are odd");

              }else {
                  System.out.println(input[i]+", "+input[i+1] + " -> different");
              }
          }
      }else {
          System.out.println("invalid length");
      }
    }
}
