
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays are used to hold multiple values in a single variable
		
				// Declaring names which can hold 3 strings
				
				String[]  names = new String[3];
				names[0] = "Soujanya";
				names[1] = "Konduru";
				names[2] = "Venkata";
				
				// Printing all the names in array
				for (int i =0;i<names.length; i++)
				{
					System.out.println("name:" +names[i]);
				}
				
				// Another way of looping is
				for(String name : names)
				{
					System.out.println(name);
				}
				
				Integer[] numbers = new Integer[3];
				numbers[0] = 1;
				numbers[1] = 2;
				numbers[2] = 3;
				
				for(int i=0; i<numbers.length; i++ )
				{
					System.out.println("Numbers: "+ numbers[i]);
					
				}
				
				for(int number : numbers)
				{
					System.out.println(number);
				}
				
	}

}
