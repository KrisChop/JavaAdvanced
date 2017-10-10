package DataRepresentationAndDataManipulationLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class RecursiveDrawing05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n ==0)return;

        for (int i = n; i > 0; i--) {
            System.out.println(String.join("", Collections.nCopies(i,"*")));
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(String.join("", Collections.nCopies(i,"#")));
        }
    }
}
