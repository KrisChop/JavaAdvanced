package StringProcessingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MagicExchangeableWords06 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input =ASDString.charAt(i) + "")){
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
