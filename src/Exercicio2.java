import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        Double nota;

        System.out.println("Digite a nota para classificar");
        nota = ler.nextDouble();

        if ((nota >= 9) && (nota <= 10)) {
            System.out.println(" nota Excelente !");

        } else if ((nota >= 7) && (nota <= 8.89)) {
            System.out.println(" nota boa !");

        } else if ((nota >= 4) && (nota <= 6.9)) {
            System.out.println("nota regular !");
        } else {
            System.out.println("nota ruim !ou nota invalida !");
        }
    }
}
