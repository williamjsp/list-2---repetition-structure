import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        if(numero < 0){
            System.out.println("Numero inválido!");
        }
        int divisores = 0;
        for(int i = numero; i >= 1; i--){
            if(numero % i == 0){
                divisores ++;
            }
        }
        if (divisores > 2) {
            System.out.println("Numero não primo");
        }else{
            System.out.println("Numero primo");
        }
    }
}
