import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




                System.out.print("Informe o saldo: ");
                double saldo = scanner.nextDouble();


                scanner.close();


                double reajuste = saldo * 0.01;
                double saldoReajustado = saldo + reajuste;


                System.out.printf("Saldo com reajuste de 1%%: %.2f%n", saldoReajustado);
            }
        }