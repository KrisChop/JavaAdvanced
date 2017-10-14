package ObjectsClassesAndCollectionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class HotPotato02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input =reader.readLine().split("\\s+");
        int number = Integer.parseInt(reader.readLine());
        ArrayDeque<String> result = new ArrayDeque<>();

        Collections.addAll(result, input);

        while (result.size() > 1){
            for (int i = 1; i < number; i++) {
                result.offer(result.poll());
            }
            System.out.println("Removed "+result.poll());
        }
        System.out.println("Last is "+result.poll());
    }
}
