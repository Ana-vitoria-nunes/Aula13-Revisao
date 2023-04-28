import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner receptor = new Scanner(System.in);
        String nome;
        int numero;
        int N=5;

        System.out.println("Digite seu nome: ");
        nome=receptor.next();
        System.out.println("Digite seu numero de usuario: ");
        numero=receptor.nextInt();
        for (int i=0; i<N;i++){
            System.out.println(i+"ª"+nome);
            System.out.println(i+"ª"+numero);
            System.out.println("--------------------------------------------");
        }
    }
}
