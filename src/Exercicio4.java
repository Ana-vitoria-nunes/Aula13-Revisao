import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner Leridade = new Scanner(System.in);
        int idade;
        int soma=0;

        for (int i=0; i<20; i++){
            System.out.println("Digite A idade da "+i+"ª pessoa: ");
            idade=Leridade.nextInt();

            soma=soma+idade;
        }
        int media= soma/20;
        System.out.println("A média das idades é: "+media);
    }
}
