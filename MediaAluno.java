package br.com.xti.logica;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double V1 = s.nextDouble();
        double V2 = s.nextDouble();
        double V3 = s.nextDouble();
        double V4 = s.nextDouble();

        double media = ((V1*2) + (V2*3) + (V3*4) + (V4*1)) / 10; // Valor da nota * pelo peso e somar todos valores
        // por final divir pela soma dos pesos

        media = Math.floor(media * 10) / 10; // arredondar para baixo
        System.out.println("Media: " + String.format("%.1f",media));

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media <= 4.9) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = s.nextDouble();
            System.out.println("Nota do exame: " + exame);
            double mediafinal = (media + exame) / 2;

            if (mediafinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + mediafinal);
        }
    }

}
