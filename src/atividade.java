import java.util.Scanner;


public class atividade {
 public static void main(String[] args) throws Exception {
    
    Scanner ler = new Scanner(System.in);

    int opcao;

    System.out.println("Selecione uma opcao abaixo no menu");
    System.out.println("1 X-tudo(R$ 15,00) ");
    System.out.println("2- X-Becon(R$ 18,00)");
    System.out.println("3- Refrigerante (R$ 6,00) ");
    System.out.println("4- Suco (R$ 8,00)");
    opcao = ler.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Pedido computado !");
            System.out.println("X-tudo (R$ 15,00)");
            break;
        case 2:
            System.out.println("Pedido computado !");
            System.out.println("X-tudo (R$ 15,00)");
            break;
        case 3:
             System.out.println("Pedido computado !");
             System.out.println("X-Becon (R$ 18,00) ");
             break;
        case 4:
             System.out.println("Pedido computado !");
             System.out.println("Refrigerante (R$ 6,00) ");
             break;
        case 5:
             System.out.println("Pedido computado !");
             System.out.println("Suco (R$ 8,00) ");
             break;
        default:
             System.out.println("Opcao invalida! ");
             break;

    }
}
}