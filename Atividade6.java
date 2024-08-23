import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){

        int menorValor = 99999999;
        int maiorValor = -9999999;
        int somaValores = 0;
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos numeros você deseja digitar: ");
        int quantidadeNumero = scan.nextInt();
        for (int i = 0; i <= quantidadeNumero; i++){
            System.out.println("Digite o numero:");
            numero = scan.nextInt();
            while(numero < 0 || numero > 1000){
                System.out.println("erro: apenas numeros entre 0 e 1000");
                numero = scan.nextInt();
            }
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

