
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaAnna = new Conta();
		contaDaAnna.saldo = 445.37;
		contaDaAnna.deposita(176000.00);
		System.out.println( "Saldo da Anna Carolina: " + contaDaAnna.saldo);
		contaDaAnna.saca(0);
		System.out.println( "Saldo da Anna Carolina: " + contaDaAnna.saldo);
		boolean conseguiuRetirar = contaDaAnna.saca(100);
		System.out.println("Saldo da Anna Carolina: " + contaDaAnna.saldo);
		System.out.println("Saque da Anna Carolina: " + conseguiuRetirar);
		
		 Conta contaDaThayane = new Conta();
		 contaDaThayane.deposita(1000);
		 
		 if(contaDaThayane.transfere(3000, contaDaAnna)){
			 System.out.println("Transferência efetuada com sucesso");
		 } else {
			 System.out.println("Não há saldo disponível para a transação...");
		 }
		 
		 System.out.println("Saldo da Thayane: " + contaDaThayane.saldo);
		 System.out.println("Saldo da Anna Carolina: " + contaDaAnna.saldo);
	}

}

