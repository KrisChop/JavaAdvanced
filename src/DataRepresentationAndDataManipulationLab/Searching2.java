package DataRepresentationAndDataManipulationLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Searching2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int searchedNum = Integer.parseInt(reader.readLine());
        boolean isFound = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchedNum){
                System.out.println(i);
                isFound = false;
                break;
            }
        }
        if (isFound){
            System.out.println("-1");
        }
    }
}
