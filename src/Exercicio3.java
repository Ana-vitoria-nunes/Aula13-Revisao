import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int nota[] = new int[3];
        int codAluno[] = new int[1];
        String nomeAluno[] = new String[1];

        nota[0]=100;
        nota[1]=70;
        nota[2]=30;
        codAluno[0]=1150;
        nomeAluno[0]="Ana";

        int ME=(nota[0]+nota[1]+nota[2])/3;
        int MA=(nota[0]+nota[1]*2+nota[2]*3+ME)/7;

        if (MA>=90){
            System.out.println("Número do aluno: "+codAluno[0]);
            System.out.println("Primeira nota:"+nota[0]);
            System.out.println("Segunda nota:"+nota[1]);
            System.out.println("Terceira nota:"+nota[2]);
            System.out.println("Média das notas: "+ME);
            System.out.println("Média de aproveitamento: "+MA);
            System.out.println("Você tirou A e está Aprovado ");
        }
        else if (MA>=75 & MA<90) {
            System.out.println("Número do aluno: "+codAluno[0]);
            System.out.println("Primeira nota:"+nota[0]);
            System.out.println("Segunda nota:"+nota[1]);
            System.out.println("Terceira nota:"+nota[2]);
            System.out.println("Média das notas: "+ME);
            System.out.println("Média de aproveitamento: "+MA);
            System.out.println("Você tirou B e está Aprovado ");
        }
        else if (MA>=60 & MA<75) {
            System.out.println("Número do aluno: "+codAluno[0]);
            System.out.println("Primeira nota:"+nota[0]);
            System.out.println("Segunda nota:"+nota[1]);
            System.out.println("Terceira nota:"+nota[2]);
            System.out.println("Média das notas: "+ME);
            System.out.println("Média de aproveitamento: "+MA);
            System.out.println("Você tirou C e está Aprovado ");
        }
        else if (MA>=40 & MA<60) {
            System.out.println("Número do aluno: "+codAluno[0]);
            System.out.println("Primeira nota:"+nota[0]);
            System.out.println("Segunda nota:"+nota[1]);
            System.out.println("Terceira nota:"+nota[2]);
            System.out.println("Média das notas: "+ME);
            System.out.println("Média de aproveitamento: "+MA);
            System.out.println("Você tirou D e está Reprovado ");
        }
        else {
            System.out.println("Número do aluno: "+codAluno[0]);
            System.out.println("Primeira nota:"+nota[0]);
            System.out.println("Segunda nota:"+nota[1]);
            System.out.println("Terceira nota:"+nota[2]);
            System.out.println("Média das notas: "+ME);
            System.out.println("Média de aproveitamento: "+MA);
            System.out.println("Você tirou E e está Reprovado");
        }


    }
}
