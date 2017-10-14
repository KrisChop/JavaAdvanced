package DataRepresentationAndDataManipulationEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class OverlappingIntervals06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        TreeMap<Integer,Integer> intervals = new TreeMap<>();
        boolean overLap = false;

        for (int i = 0; i < n; i++) {
            int[] intArr = Arrays.stream(reader.readLine().split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            int startInterval = intArr[0];
            int endInterval = intArr[1];
            intervals.put(startInterval,endInterval);
        }

        for (int i = 0; i < intervals.size() - 1; i++) {

            int currentInterval = (int) intervals.keySet().toArray()[i];
            int currentIntervalValue = intervals.get(currentInterval);
            int nextInterval = (int) intervals.keySet().toArray()[i + 1];


            if (currentInterval <= nextInterval && nextInterval <= currentIntervalValue){
                overLap = true;
            }

        }
        System.out.println(overLap);
    }
}
