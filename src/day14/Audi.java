package day14;

public class Audi extends Car{

	String model;
	public void accelerate()
	{
		System.out.println("Car acceleration");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="Audi";
		a.accelerate();
		a.price=1111;
		a.start();

	}

}
