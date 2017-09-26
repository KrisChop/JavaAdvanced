package JavaIntroEx;

import java.util.Locale;
import java.util.Scanner;

public class TriangleArea02 {

    public static void main(String[] args) {
         Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        Integer Ax = sc.nextInt();
        Integer Ay = sc.nextInt();
        Integer Bx = sc.nextInt();
        Integer By = sc.nextInt();
        Integer Cx = sc.nextInt();
        Integer Cy = sc.nextInt();

        Integer area = Math.abs(Ax*(By-Cy) + Bx*(Cy-Ay)+Cx*(Ay-By)) / 2;

        System.out.println(area);
        //Ax(By−Cy)+Bx (Cy −Ay )+Cx(Ay−By )
    }
}
