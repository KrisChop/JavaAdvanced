package ObjectsClassesAndCollectionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class AcademyGraduation06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Double> result = new TreeMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {

            String name = reader.readLine();
            String[] score = reader.readLine().split(" ");
            double sum =0;

            for (int j = 0; j <score.length ; j++) {
                sum+=Double.parseDouble(score[j]);
            }

            double avgScore = sum / score.length;
            result.put(name,avgScore);
        }

        for (String key : result.keySet()) {
            System.out.println(key+" is graduated with " + result.get(key));
        }
    }
}
