package DataRepresentationAndDataManipulationLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Searching02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int searchedNum = Integer.parseInt(reader.readLine());

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchedNum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
