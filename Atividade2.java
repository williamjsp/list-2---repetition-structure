import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        int numero = 0;

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        while(numero <= N){
            System.out.println(numero);
            numero += 1;
        }
    }
}
