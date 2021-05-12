package seleniumpracticeJ;
public class TestHonda {
	public static void main(String[] args) {
		Audi myHonda = new Honda();
	        myHonda.capacity();
		myHonda.speed();
		myHonda.features();
		System.out.println("The car has" + myHonda.wheels);
		System.out.println("This car is of" + myHonda.type);

	}

}