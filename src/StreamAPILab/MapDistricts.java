package StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapDistricts {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       HashMap<String , List<Integer>> cities = new HashMap<>();
       String[] tokens = reader.readLine().split("\\s+");
       int limit = Integer.parseInt(reader.readLine());

        for (String token : tokens) {
            String[] cityArgs = token.split(":");
            String cityName = cityArgs[0];
            int cityPopulation = Integer.parseInt(cityArgs[1]);

            cities.putIfAbsent(cityName , new ArrayList<>());
            cities.get(cityName).add(cityPopulation);
        }
        cities.entrySet().stream()
                .filter(city -> city.getValue().stream().mapToInt(Integer::valueOf).sum()> limit)
                .sorted((e1 ,e2) -> Integer.compare(
                        e2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        e1.getValue().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(e->{
                    System.out.printf("%s: ",e.getKey());
                    e.getValue().stream()
                            .sorted((n1,n2)-> Integer.compare( n2 , n1))
                            .limit(5)
                            .forEach(l -> System.out.print(l + " "));

                    System.out.println();
                });
    }
}
