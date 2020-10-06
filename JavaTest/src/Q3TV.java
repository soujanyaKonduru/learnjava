
public class Q3TV {
	
	private String  color;
	private int size;
	private String model; 
	private String make;
	private int price;
	
	
	public Q3TV()
	{
		System.out.println("This is a no argument constructor");
		
		color = "black";
		size  = 60;
		model = "hybrid";
		make = "Sony";
		price = 500;
		
	}
	
	public Q3TV(String color, int size)
	{
		this.color = color;
		this.size = size;
		
	}
	
	public Q3TV(String model, String make, int price)
	{
		this.model = model;
		this.make =make;
		this.price = price;
		
	}

}
