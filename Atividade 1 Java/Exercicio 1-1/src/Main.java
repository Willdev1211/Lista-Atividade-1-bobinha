import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite ");
        System.out.print("Digite a idade em anos: ");
        int anos = s.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = s.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = s.nextInt();


        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade total em dias é: " + totalDias);


        s.close();
    }
}