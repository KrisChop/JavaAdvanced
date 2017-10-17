package StreamAPIEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortStudents04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> students = new ArrayList<>();

        while (true){
            String [] input = reader.readLine().split("\\s+");
            if ("END".equals(input[0])){
                break;
            }
            students.add(input[0] + " " + input[1]);
        }
        students.stream().sorted((a,b) -> {
            if (a.split(" ")[1].compareTo(b.split(" ")[1]) == 0){
                return b.split(" ")[0].compareTo(a.split(" ")[0]);
            }
            return a.split(" ")[1].compareTo(b.split(" ")[1]);
        }).forEach(System.out::println);
    }
}
