package ObjectsClassesAndApisEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumElement02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int commandCount = Integer.parseInt(reader.readLine());
        Deque<Integer> someNumbers = new ArrayDeque<>();
        Deque<Integer> maxNumbers = new ArrayDeque<>();
        int maxElement =Integer.MIN_VALUE;

        for (int i = 0; i < commandCount; i++) {

            String[] commands = reader.readLine().split(" ");
            int command = Integer.parseInt(commands[0]);

            switch (command){
                case 1:
                    int number = Integer.parseInt(commands[1]);
                    if (number >= maxElement){
                        maxElement=number;
                        maxNumbers.push(maxElement);
                    }
                    someNumbers.push(number);
                    break;
                case 2:
                    int detectedNum = someNumbers.pop();
                    if (detectedNum == maxElement) {
                        maxNumbers.pop();
                        if (!maxNumbers.isEmpty()) {
                            maxElement = maxNumbers.peek();
                        } else {
                            maxElement = Integer.MIN_VALUE;
                        }
                    }
                    break;
                case 3:
                    System.out.println(maxNumbers.peek());
                    break;
            }
        }
    }
}
