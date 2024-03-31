import java.util.Scanner;

public class Ex01_Conta_Bancaria {
	 private double saldo;

	    public Ex01_Conta_Bancaria(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    public void depositar(double valor) {
	        this.saldo += valor;
	        System.out.println("Depósito de " + valor + " realizado com sucesso.");
	        System.out.println("Saldo atual: " + this.saldo);
	    }

	    public static void main(String[] args) {
	        double saldoInicial = 5000;
	        Ex01_Conta_Bancaria conta = new Ex01_Conta_Bancaria(saldoInicial);
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.print("Digite o valor do depósito (ou 0 para sair): ");
	                double valorDeposito = scanner.nextDouble();
	                
	                if (valorDeposito == 0) {
	                    System.out.println("Encerrando o programa.");
	                    break;
	                } else if (valorDeposito < 0) {
	                    System.out.println("Valor de depósito inválido. Por favor, digite um valor positivo.");
	                } else {
	                    conta.depositar(valorDeposito);
	                }
	            } catch (Exception e) {
	                System.out.println("Por favor, digite um valor numérico válido.");
	                scanner.next(); // Limpar o buffer do scanner
	            }
	        }
	        
	        scanner.close();
	    }
}
