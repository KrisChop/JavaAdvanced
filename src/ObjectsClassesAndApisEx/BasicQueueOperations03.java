package ObjectsClassesAndApisEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BasicQueueOperations03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] numbers = reader.readLine().split(" ");
        int n =Integer.parseInt(numbers[0]);
        int s =Integer.parseInt(numbers[1]);
        String x = numbers[2];

        String [] queue = reader.readLine().split("\\s+");

        ArrayDeque<String> queuedNums = new ArrayDeque<>();
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            queuedNums.add(queue[i]);
        }
        for (int i = 0; i < s; i++) {
            queuedNums.poll();
        }
        for (String num : queuedNums) {
            if (Integer.parseInt(num) < smallest){
                smallest = Integer.parseInt(num);
            }
        }

        if (queuedNums.contains(x)){
            System.out.println("true");
        }else if (queuedNums.isEmpty()){
            System.out.println("0");
        }else if (!queuedNums.contains(x)){
            System.out.println(smallest);
        }
    }
}
