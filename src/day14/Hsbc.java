package day14;

public class Hsbc  implements Bank{

	
	public static void main(String[] args) {
		Hsbc h=new Hsbc();
		h.debit();
		h.credit();
		h.moneyTransfer();

	}


	public void debit() {
		System.out.println("debit process in hsbc");
	}

	
	public void credit() {
		System.out.println("crediting procedure");
		
	}


	public void moneyTransfer() {
		System.out.println("Money transfer policy");
		
	}

}
