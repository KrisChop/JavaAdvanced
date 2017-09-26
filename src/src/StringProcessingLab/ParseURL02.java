package StringProcessingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseURL02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("://");
        if (input.length != 2){
            System.out.println("Invalid URL");
            return;
        }
        String protocol = input[0];
        String linkInput = input[1];

        int index = linkInput.indexOf("/");

        String server = linkInput.substring(0,index);
        String resources = linkInput.substring(index +1);

        System.out.println("Protocol = " + protocol);
        System.out.println("Server = " + server);
        System.out.println("Resources = "+ resources);
    }
}
