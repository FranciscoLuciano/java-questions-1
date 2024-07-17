package Atividade5;
import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String NomeTrabalhador;
        float horasTrabalhadas;
        float numeroDependentes;


        System.out.println("Nome Funcionario: ");
        NomeTrabalhador = sc.nextLine();

        System.out.println("Horas Trabalhadas: ");
        horasTrabalhadas = sc.nextFloat();

        System.out.println("Numero de dependentes: ");
        numeroDependentes = sc.nextFloat();

        double horasFinal, dependentesFinal, salarioBruto, salarioPreLiquido, salarioLiquido;

         horasFinal = horasTrabalhadas * 3.00;
         dependentesFinal = numeroDependentes * 100.00;

         salarioBruto = horasFinal + dependentesFinal;

         salarioPreLiquido = salarioBruto * 0.135;

         salarioLiquido = salarioBruto - salarioPreLiquido;

        System.out.println( NomeTrabalhador );
        System.out.println( "Salario Liquido: " +salarioLiquido);

    }
}
