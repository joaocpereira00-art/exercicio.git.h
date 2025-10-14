import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner ler= new Scanner(System.in);
    int numero;
    System.out.println("Digite um número");
    numero= ler.nextInt();

    if(numero >=0){
        System.out.println(" O numero digitado é possitivo");

    }
    else if(numero == 0) {
        System.out.println(" O numero digitado0, mas é positivos !");

    }
    else{
        System.out.println(" O numero digitado é negativo !");
    }
    
    }
}

