package JavaIntroEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XBits10 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] numbers = new String[8];
        for (int i = 0; i < numbers.length; i++) {
            String binary = String.format("%32s",Integer.toBinaryString(Integer.parseInt(reader.readLine()))).replace(' ', '0');
            numbers[i] = binary;
        }
        int counter = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = 0; j < numbers[i].length() - 2; j++) {
                String first = numbers[i].charAt(j)+ "" + numbers[i].charAt(j + 1) + numbers[i].charAt(j + 2);
                String second = numbers[i + 1].charAt(j)+ "" + numbers[i + 1].charAt(j + 1) + numbers[i + 1].charAt(j + 2);
                String third  = numbers[i + 2].charAt(j)+ "" + numbers[i + 2].charAt(j + 1) + numbers[i + 2].charAt(j + 2);

                if (first.equals("101") && second.equals("010") && third.equals("101")){
                    counter++;
                }
            }
        }

        System.out.println(counter);
        //101 010 101
    }
}
