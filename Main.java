import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double saldo = 0;
        boolean estaRodando = true;

        while (estaRodando) {

            System.out.println("************");
            System.out.println("Programa Bancario");
            System.out.println("************");

            System.out.println("1. Mostrar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            System.out.println("************");

            System.out.println("Digite sua escolha: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    mostrarSaldo(saldo);
                    break;

                case 2:
                    saldo += depositar();
                    break;

                case 3:
                    saldo -= saque(saldo);
                    break;

                case 4:
                    estaRodando = false;
                    break;

                default:
                    System.out.println("Escolha invalida ");
            }
        }
        scanner.close();
    }

    static void mostrarSaldo(double saldo) {
        System.out.printf("$%.2f%n", saldo);
    }

    static double depositar() {
        double quantidade;

        System.out.print("Entre com o valor que deseja depositar: ");
        quantidade = scanner.nextDouble();

        if (quantidade < 0) {
            System.out.println("O deposito nao pode ser negativo!");
            return 0;
        }

        return quantidade;
    }

    static double saque(double saldo) {
        double quantidade;

        System.out.print("Digite aqui o valor para sacar: ");
        quantidade = scanner.nextDouble();

        if (quantidade > saldo) {
            System.out.println("Fundos Insuficientes!");
            return 0;
        } else if (quantidade < 0) {
            System.out.println("Quantia nao pode ser negativa!");
            return 0;
        }
        return quantidade;
    }
}