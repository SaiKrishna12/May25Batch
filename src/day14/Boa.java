package day14;

public class Boa implements Bank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boa b=new Boa();
		b.debit();
		b.credit();

	}

	@Override
	public void debit() {
		System.out.println("abc");
		
	}

	@Override
	public void credit() {
		System.out.println("xyz");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("def");
		
	}

}
