public class Atividade4 {
    public static void main(String[] args){
        int anteriorPos = 0;
        int atualPos = 1;
        int proximaPos = 0;

        while(proximaPos < 500){
            System.out.println(atualPos);
            proximaPos = atualPos + anteriorPos;
            anteriorPos = atualPos;
            atualPos = proximaPos;
        }


    }
}
