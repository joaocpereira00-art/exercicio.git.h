import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int i, numerodigita, somapares;
        for(i=1; i<5; i++){
            System.out.println("Digite o " +i+" numero:"); 
            numerodigita = ler.nextInt();

            if(numerodigita % 2 ==0){
                somapares = somapares + numerodigita;
            }
        }
    }
}
