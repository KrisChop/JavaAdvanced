package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomComparator09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        List<Integer>evenNums = new ArrayList<>();
        List<Integer>oddNums = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenNums.add( numbers[i]);
            }else {
                oddNums.add(numbers[i]);
            }
        }
        evenNums.sort(Integer::compareTo);
        oddNums.sort(Integer::compareTo);
        for (Integer evenNum : evenNums) {
            System.out.print(evenNum + " ");
        }

        for (Integer oddNum : oddNums) {
            System.out.print(oddNum + " ");
        }

    }
}
