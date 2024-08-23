import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        while(nome.length() <=3){
            System.out.println("erro, é necessario mais de 3 digitos ");
            System.out.println("Digite seu nome: ");
            nome = scan.next();
        }
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        while(idade < 1 || idade > 149) {
            System.out.println("erro, idade invalida ");
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();
        while(salario <= 0){
            System.out.println("erro, salario inválido");
            salario = scan.nextDouble();
        }
        System.out.println("Digite seu sexo, com f ou m: " );
        char sexo = scan.next().toLowerCase().charAt(0);
        while(!(sexo == 'f' || sexo == 'm')){
            System.out.println("erro, sexo invalido");
            sexo = scan.next().toLowerCase().charAt(0);
        }
        System.out.println("Digite seu estado civil, com s, c, v ou d: ");
        char estadoCivil = scan.next().toLowerCase().charAt(0);
        while(!(estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v'
                || estadoCivil == 'd')){
            System.out.println("erro, sexo invalido");
            estadoCivil = scan.next().toLowerCase().charAt(0);
        }
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadoCivil);
    }
    }
