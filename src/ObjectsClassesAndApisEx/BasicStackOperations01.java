package ObjectsClassesAndApisEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class BasicStackOperations01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        String[] area = reader.readLine().split("\\s+");

        Integer countRemoveElements = Integer.parseInt(input[1]);
        Integer searchedElement = Integer.parseInt(input[2]);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Arrays.stream(area).map(Integer::parseInt).forEach(deque::push);
        IntStream.range(0, countRemoveElements).forEach(i -> deque.removeFirst());
        if (deque.contains(searchedElement)) {
            System.out.println("true");
        } else {
            if (deque.size() == 0) {
                System.out.print(deque.size());

            } else {
                System.out.println(Collections.min(deque));
            }
        }
    }
}
