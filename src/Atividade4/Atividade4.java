package Atividade4;
import java.util.Scanner;


public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1:");
        float notaUm = sc.nextFloat();

        System.out.println("Nota 2:");
        float notaDois = sc.nextFloat();

        System.out.println("Nota 3:");
        float notaTres = sc.nextFloat();

        float mediaNumUm = notaUm * 2;
        float mediaNumDois = notaDois * 3;
        float mediaNumTres = notaTres * 5;

        float mediaFinal = mediaNumUm + mediaNumDois + mediaNumTres;

        float somaPeso = mediaFinal / 10;

        System.out.println("Nota Final: " +somaPeso);
    }
}
