
public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da Primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da Segunda: " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("Saldo da Segunda: " + segundaConta.saldo);
		
		System.out.println("Saldo da Primeira: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
			
		} else {
			System.out.println("contas diferentes");
		}
	}

}
