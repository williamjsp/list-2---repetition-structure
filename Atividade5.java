import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        int menorValor = 99999999;
        int maiorValor = -9999999;
        int somaValores = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos numeros você deseja digitar: ");
        int quantidadeNumero = scan.nextInt();
        for (int i = 0; i <= quantidadeNumero; i++){
            System.out.println("Digite o numero:");
            int numero = scan.nextInt();

            if(numero > maiorValor){
                maiorValor = numero;
            }
            if(numero < menorValor){
                menorValor = numero;
            }
            somaValores += numero;
        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + somaValores);
    }
}
