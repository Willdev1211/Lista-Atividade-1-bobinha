import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário do usuário: R$ ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha o equivalente a " + String.format("%.2f", quantidadeSalariosMinimos) + " salários mínimos.");

        scanner.close();
    }
}
