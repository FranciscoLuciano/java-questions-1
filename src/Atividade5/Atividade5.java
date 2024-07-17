package Atividade5;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeTrabalhador;
        float horasTrabalhadas;
        float numeroDependentes;


        System.out.println("Nome Funcionario: ");
        nomeTrabalhador = sc.nextLine();

        System.out.println("Horas Trabalhadas: ");
        horasTrabalhadas = sc.nextFloat();

        System.out.println("Numero de dependentes: ");
        numeroDependentes = sc.nextFloat();

        double horasFinal, dependentesFinal, salario;

         horasFinal = horasTrabalhadas * 3.00;
         dependentesFinal = numeroDependentes * 100.00;
        salario = (horasFinal + dependentesFinal);

        salario -= salario * 0.135;


        System.out.println( "Trabalhador: " + nomeTrabalhador );
        System.out.println( "Salario Liquido: " + salario);

    }
}
