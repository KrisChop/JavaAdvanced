package JavaIntroEx;

import java.util.Scanner;

public class GameofNames {
    public  static  void   main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int num =Integer.parseInt(scanner.nextLine());
        String bestName = "" ;
        long bestScore =Long.MIN_VALUE;

        for (int i = 0; i < num ; i++) {
            String name = scanner.nextLine();
            int initialScore = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) % 2 == 0){
                    initialScore += name.charAt(j);
                } else if (name.charAt(j) % 2 !=0) {
                    initialScore -= name.charAt(j);
                }
            }
            if (initialScore > bestScore){
                bestScore = initialScore;
                bestName = name;
            }
        }
        System.out.println("The winner is "+bestName +" - "+bestScore +" points");

    }
}
