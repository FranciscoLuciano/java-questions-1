package Atividade6;
import java.util.Scanner;
import java.lang.Math;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, R = 0, S = 0, D = 0;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        R = Math.pow(A + B, 2);
        S = Math.pow(B + C, 2);

        D = (R + S) / 2;

        System.out.println(D);
    }
}
