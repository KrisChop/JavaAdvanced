package ObjectsClassesAndApisEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class TruckTour04 {
    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        ArrayDeque<String[]> allPumps = new ArrayDeque<>();

        for (int i = 0; i < number; i++) {
            allPumps.addLast(reader.readLine().split(" "));
        }

        int counter = 0;
        while (true) {
            long fuel = 0;
            boolean found = true;
            for (String[] petrolPump : allPumps) {
                long petrol = Integer.parseInt(petrolPump[0]);
                long distance = Integer.parseInt(petrolPump[1]);
                fuel+=petrol;
                if (distance > fuel){
                    found = false;
                    break;
                }
                fuel-=distance;
            }
            if(found){
                System.out.println(counter);
                break;
            }
            String[] pump = allPumps.pop();
            allPumps.addLast(pump);
            counter++;
        }
    }
}
