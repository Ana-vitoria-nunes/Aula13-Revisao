import java.util.Scanner;

public class Exercico8 {
    public static void main(String[] args) {
        Scanner Qntsalario = new Scanner(System.in);
        int numsalario;
        int salario;
        Double reajuste;

               System.out.println("Quantos salaio você deseja inserir: ");
               numsalario = Qntsalario.nextInt();
               for (int i=0; i<numsalario; i++){
                   System.out.println("Degite o "+i+"ª salário: ");
                   salario = Qntsalario.nextInt();

                   System.out.println("Qual a porcentagem para o reajuste (ex:10% =0,1): ");
                   reajuste=Qntsalario.nextDouble();
                   Double S=reajuste*salario;
                   Double soma=salario+S;
                   System.out.println("O salario com reajuste é: "+soma);
               }
            }
}
