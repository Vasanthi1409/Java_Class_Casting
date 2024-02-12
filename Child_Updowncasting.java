package Class_Casting.com;

public class Child_Updowncasting extends Upcasting_Downcasting {

	@Override
	public void animal() {
		System.out.println("List out the animals");
		System.out.println("Lion");
		System.out.println("Deer");
		System.out.println("Horse");
	}

	public static void main(String[] args) {
		
		Upcasting_Downcasting U = new Child_Updowncasting();
		U.animal();

		Child_Updowncasting D = (Child_Updowncasting) new Upcasting_Downcasting();
		D.animal();
	}
}
