import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercico6 {
    public static void main(String[] args) {

        Scanner sequencia = new Scanner(System.in);
        int numero;
        int valor;
        int soma=0;

        for (int i=0; i<3; i++){
            System.out.println("Digite o "+i+"ª número: ");
            numero=sequencia.nextInt();

            if(numero>=0){
                soma= soma+numero;
                System.out.println("O resultado da soma é: "+soma);
            }
            else {
                System.out.println("Operação finalizada!!!");
            }
        }

    }
}
