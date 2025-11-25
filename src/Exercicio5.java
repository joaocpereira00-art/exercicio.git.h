import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int i,  quantidadesalario  ;
        double   soMassalario  = 0;

        System.out.println("Digite a quantidade do seu salario");
        quantidadesalario = ler.nextInt();

    //    for(contador = 1; contador <= mediasalario; contador++){
         for(i=1; i<=quantidadesalario; i++){
            System.out.println("Digite o "+i+" salario: ");
            System.out.print("R$");
            soMassalario += ler.nextDouble();

            // mediasalario = soMassalario/i;
            soMassalario = soMassalario/i;

         }
        // mediasalario = soMassalario /quantidadesalario;    o msm condigo so de maneira diferente
        System.out.println("A media salarial foi de : R$"+ soMassalario);
    }
}
