import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.print("Digite a porcentagem do IPI (em %): ");
        double ipiPorcentagem = s.nextDouble();


        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = s.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = s.nextDouble();
        System.out.print("Digite a quantidade da peça 1: ");
        int quantidadePeca1 = s.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = s.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = s.nextDouble();
        System.out.print("Digite a quantidade da peça 2: ");
        int quantidadePeca2 = s.nextInt();

        double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
        double totalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
        double valorTotalSemIPI = totalPeca1 + totalPeca2;

        double valorIPI = (ipiPorcentagem / 100) * valorTotalSemIPI;
        double valorTotalComIPI = valorTotalSemIPI + valorIPI;

        System.out.println("Código da peça 1: " + codigoPeca1);
        System.out.println("Código da peça 2: " + codigoPeca2);
        System.out.println("Valor total sem IPI: R$ " + String.format("%.2f", valorTotalSemIPI));
        System.out.println("Valor do IPI: R$ " + String.format("%.2f", valorIPI));
        System.out.println("Valor total com IPI: R$ " + String.format("%.2f", valorTotalComIPI));

        s.close();
    }
}
