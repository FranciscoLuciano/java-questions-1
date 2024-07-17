package Atividade1;


import java.util.Scanner;


public class Atividade1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero1, numero2;

        System.out.println("Entrada do 1 numero: ");
        numero1 = entrada.nextFloat();
        System.out.println("Entrada do 2 numero: ");
        numero2 = entrada.nextFloat();


        float resposta = numero1*numero2;

        System.out.println("Resposta:" +resposta);

    }
}
