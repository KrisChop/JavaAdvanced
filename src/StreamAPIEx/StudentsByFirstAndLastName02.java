package StreamAPIEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentsByFirstAndLastName02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> students = new ArrayList<>();

        while (true){
            String [] input = reader.readLine().split("\\s+");
            if (input[0].equals("END")){
                break;
            }
            if (input[0].compareTo(input[1]) < 0){
                students.add(input[0] + " " + input[1]);
            }
        }
        students.forEach(System.out::println);
    }
}
