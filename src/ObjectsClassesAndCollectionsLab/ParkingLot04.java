package ObjectsClassesAndCollectionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ParkingLot04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> parking = new HashSet<>();

        while (true){
            String[] input = reader.readLine().split(", ");

            if ("END".equals(input[0])){
                break;
            }else {
                String car = input[1];
                if ("IN".equals(input[0])) {
                    parking.add(car);
                } else {
                    parking.remove(car);
                }
            }
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : parking) {
                System.out.println(car);
            }
        }
    }
}
