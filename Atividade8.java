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
        for(int i = 1; i <= numero + 1; i++){
            if(numero % 1 == 0){
                divisores += 1;
            }
        }
        if (divisores == 2 && divisores == numero) {
            System.out.println("Numero primo");
        }else{
            System.out.println("Numero não primo");
        }
    }
}
