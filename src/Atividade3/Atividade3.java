package Atividade3;
import java.util.Scanner;


public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Cotação do dolar: ");
        float cotacaoDolar = sc.nextFloat();
        System.out.println("valor em Dolar: ");
        float valorDolar = sc.nextFloat();


        float resultaConversao = valorDolar * cotacaoDolar;


        System.out.println("Valor: " +resultaConversao);
    }

}