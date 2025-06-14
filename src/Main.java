import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         NewStudent aluno1 = new NewStudent("Lucas Mendes", 80.0, 1.75);
         NewStudent aluno2 = new NewStudent("Marina Lopes", 52.0, 1.60);

        aluno1.exibirStatus();
        System.out.println();
        aluno2.exibirStatus();
    }
}