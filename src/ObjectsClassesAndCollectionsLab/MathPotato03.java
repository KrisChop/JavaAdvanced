package ObjectsClassesAndCollectionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class MathPotato03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input =reader.readLine().split("\\s+");
        int number = Integer.parseInt(reader.readLine());
        ArrayDeque<String> result = new ArrayDeque<>();

        Collections.addAll(result, input);
        int counter =1;

        while (result.size() > 1){
            for (int i = 1; i < number; i++) {
                result.offer(result.poll());
            }
            if(IsPrime(counter)) {
                System.out.println("Prime " + result.peek());
            } else {
                System.out.println("Removed " + result.poll());
            }
            counter++;
        }
        System.out.println("Last is "+result.poll());

    }

    private static boolean IsPrime(int counter) {
        if(counter == 1){
            return false;
        }

        for (int i = 2; i < counter; i++) {
            if(counter % i == 0){
                return false;
            }
        }
        return true;
    }
}
