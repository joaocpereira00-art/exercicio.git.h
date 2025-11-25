import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        Double valorTolt, tipocliente, valorFinal, desconto;

        System.out.println("Que tipo de cliente"); 
        System.out.println("sou cliente comum (1)");
        System.out.println("sou cliente vip (2)");
        System.out.println("sou funcionario (3)");
        tipocliente = ler.nextDouble();
        
        System.out.println("Quantos tera que pagar");
        valorFinal = ler.nextDouble();

        if(tipocliente == 1) {
            desconto = valorFinal * 0.05;
            valorTolt = valorFinal -
            System.out.println("");
        }
    }
 }

