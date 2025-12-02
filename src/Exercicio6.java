import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numero, soma = 0;

        System.out.println("Digite um numero para começar ou 0 para sair: ");
        numero = ler.nextInt();

        while(numero !=0 ){
            soma += soma +numero;

            System.out.println("Digite um numero para começar ou 0 para sair: ");
            numero = ler.nextInt();

        }
        System.out.println("A soma dos numeros digitados foi: " + soma);
       
    }
}
