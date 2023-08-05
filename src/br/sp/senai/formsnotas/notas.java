package br.sp.senai.formsnotas;

import java.util.Scanner;

public class notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Nome do professor(a): ");
            String professor = teclado.nextLine();

            System.out.print("Nome do curso: ");
            String curso = teclado.nextLine();

            System.out.print("Nome do aluno: ");
            teclado.nextLine();

            System.out.print("Frequência de presença do aluno (%): ");
            float frequencia = (float) teclado.nextFloat();

            System.out.print("Qual é a nota1: ");
            int nota1 = teclado.nextInt();

            System.out.println("Qual é a nota2: ");
            int nota2 = teclado.nextInt();

            float media = (nota1 + nota2) / 2;

            if (frequencia >= 75.0 && frequencia >= 75 || media >= 6 && frequencia >= 90){
                System.out.println("Aprovado");
            } else {
                System.out.println("Resultado: Reprovado\n");
            }

            System.out.print("Deseja continuar (S/N)? ");
            String resposta = teclado.next();
            continuar = resposta.equalsIgnoreCase("S");

            teclado.nextLine();
        }

        teclado.close();
    }
}
