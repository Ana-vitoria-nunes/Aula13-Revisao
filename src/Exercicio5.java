import java.util.Scanner;

public class Exercicio5 {
        public static void main(String[] args) {
            Scanner Lernumero = new Scanner(System.in);
            int numero=0;
            int y =0;

            for (int i =1; i <=20; i++) {
                System.out.println("Digite o " + i + "ª número: ");
                numero= Lernumero.nextInt();

                if (numero>=0 & numero<=100){
                    y= y+1;
                }
            }
            System.out.println("----------------------------------------------");
            System.out.println("Foi digitado "+y+" numeros entre 0 e 100.");
        }
}
