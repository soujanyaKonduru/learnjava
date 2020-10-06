import java.util.ArrayList;

public class Q4Car {
	
	private String model;
	private String make;
	private Boolean electric;
	
	public Q4Car(String model, String make, Boolean electric)
	{
		this.model = model;
		this.make = make;
		this.electric = electric;
	}
	
	public void start()
	{
		
	}
	
	public void display()
	{
		System.out.println("Car's Model: " +model);
		System.out.println("Make: " +make);
		System.out.println("Electric: " +electric);
	}

	
	public static void main(String[] args) {
		
		ArrayList<Q4Car> Cars = new ArrayList<Q4Car>();
		Q4Car car1 = new Q4Car("Prius", "Toyota", false);
		Cars.add(car1);
		Q4Car car2 = new Q4Car("carola", "Toyota", true);
		Cars.add(car2);
		Q4Car car3 = new Q4Car("Seinna", "Toyota", false);
		Cars.add(car3);
		for( Q4Car car: Cars )
		{
			car.display();
			
		}
			
	}
	
	
}
