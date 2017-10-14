package ObjectsClassesAndCollectionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class SoftUniParty05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        TreeSet<String> guest = new TreeSet<>();

        while (!"PARTY".equals(input)){
            guest.add(input);
            input = reader.readLine();
        }
        while (!"END".equals(input)){
            guest.remove(input);
            input = reader.readLine();
        }
        System.out.println(guest.size());
        for (String g : guest) {
            System.out.println(g);
        }
    }
}
