import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Digite um número: ");
            int n1 = scan.nextInt();

            System.out.println("Digite outro número: ");
            int n2 = scan.nextInt();
            int media = n1 + n2;
            System.out.println(media);
            System.out.println("Deseja realizar mais um soma?  [S ou N]");
            String quererContinuar = scan.next().toUpperCase();
            if(!quererContinuar.equals("S")){
                break;
            }
        }
    }
}
