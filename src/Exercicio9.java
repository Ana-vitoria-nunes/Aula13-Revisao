public class Exercicio9 {
    public static void main(String[] args) {
        int armazena[], valor = 101;
        String aux;
        armazena = new int [50];

        System.out.println("Vetor criado...");
        System.out.println("Iniciando preenchimento automatico...");

        for (int i = 0; i < 50; i++){
            armazena[i] = valor;
            valor++;
        }
        System.out.println("Preenchimento concluído!!!");

        for (int x = 0; x < 50; x++){
            aux = "";
            if (x < 10)
                aux = "0";
            System.out.println("Valor " + aux + x + ": " + armazena[x]);
        }

    }

}
