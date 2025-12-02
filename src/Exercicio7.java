import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class Exercicio7 {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int  opcao;
        double valorSoma = 0;

        System.out.println("Lanchonete do Tião");

        System.out.println("Escolha uma das opcao do menu abaixo");
        System.out.println("1 - X-Salada (R$ 15,00)");
        System.out.println("2 - X-Bacon (R$ 18,00)");
        System.out.println("3 - Refrigerante (R$ 6,00)");
        System.out.println("4 - Suco(R$ 8,00)");
        System.out.println("Digite 0 para finalizar o pedido");
        opcao = ler.nextInt();


        while(opcao != 0){

            switch (opcao){
                case 1:
                valorSoma +=  15.00;
                case 2:
                valorSoma += 18.00;
                case 3:
                valorSoma += 6.00;
                case 4:
                valorSoma += 8.00;
                default:
                System.out.println("Opcao invalida e o programa sera fechado");
                break;
            }

            System.out.println("Digite o numeroda opção: ");
            opcao = ler.nextInt();
        }

    }
}
