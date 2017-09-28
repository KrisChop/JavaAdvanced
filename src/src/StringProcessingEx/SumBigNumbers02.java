obfhbsdHCpackage StringProcessingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumBigNumbers02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String firstNum = reader.readLine();
//        String secondNum = reader.readLine();
        BigInteger firstBig = new BigInteger(reader.readLine());
        BigInteger secondBig = new BigInteger(reader.readLine());

        System.out.println(firstBig.add(secondBig));
    }
}
