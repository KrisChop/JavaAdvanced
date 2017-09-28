package StringProcessingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MagicExchangeableWords06 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(" ");
        if(input[0].length() > input[1].length()){
            System.out.println(ExchangableWords(input[1], input[0]));
        } else {
            System.out.println(ExchangableWords(input[0], input[1]));
        }
    }

    private static boolean ExchangableWords(String firstString, String secondString) {

        HashMap<Character, Character> store = new HashMap<>();
        String word1 = "";
        String word2 = "";

        for (int i = 0; i < firstString.length(); i++) {
            if(!word1.contains(firstString.charAt(i) + "")){
                word1 += firstString.charAt(i);
            }
            if (store.containsKey(firstString.charAt(i))) {
                if (store.get(firstString.charAt(i)) != secondString.charAt(i)) {
                    return false;
                }
            } else {
                store.put(firstString.charAt(i), secondString.charAt(i));
            }
        }

        for (int i = 0; i < secondString.length(); i++) {
            if(!word2.contains(secondString.charAt(i) + "")){
                word2 += secondString.charAt(i);
            }
        }

        return word1.length() == word2.length();
    }
}
