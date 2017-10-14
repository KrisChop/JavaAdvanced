package DataRepresentationAndDataManipulationEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[intArr.length - 1 - i] + " ");
        }
    }
}
