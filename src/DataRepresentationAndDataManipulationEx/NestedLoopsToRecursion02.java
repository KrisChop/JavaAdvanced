package DataRepresentationAndDataManipulationEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NestedLoopsToRecursion02 {
    public static int numberOfLoops;
    public static int[] loops;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numberOfLoops = Integer.parseInt(reader.readLine());
        loops = new int[numberOfLoops];
        nestedLoops(0);
    }

    public static void nestedLoops(int currentLoop) {
        if (currentLoop == numberOfLoops) {
            printLoop();
            return;
        }

        for (int counter = 1;counter <= numberOfLoops;counter++) {
            loops[currentLoop] = counter;
            nestedLoops(currentLoop + 1);
        }
    }

    private static void printLoop() {
        System.out.println(Arrays.toString(loops).replaceAll("[\\]\\[,]", ""));
    }
}
