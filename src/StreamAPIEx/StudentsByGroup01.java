package StreamAPIEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentsByGroup01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> students = new ArrayList<>();

        while (true){
            String [] input = reader.readLine().split("\\s+");
            if ("END".equals(input[0])){
                break;
            }else {
                String firstName = input[0];
                String secondName = input[1];
                int group = Integer.parseInt(input[2]);
                if (2 == group){
                    students.add(firstName + " " + secondName);
                }
            }
        }
        students.stream().sorted((a,b) -> a.split(" ")[0].compareTo(b.split(" ")[0])).forEach(System.out::println);
    }
}
