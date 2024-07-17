package Atividade2;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] dados, dadosDoProfessor = new String[11];
        dados = new String[]{"Nome ", "Endereço ", "cidade ", "UF ", "CEP ", "telefone ", "CPF ", "RG ", "DatadeNascimento ", "GrauEscola ", "Curso "};

        for(int i = 0; i<dados.length; i++) {
            System.out.println(dados[i]+ ":");
            dadosDoProfessor[i] = sc.next();
        }

        for(int i=0; i < dados.length; i++){
            System.out.println(dados[i] + " " + dadosDoProfessor[i]);
        }


    }
}
