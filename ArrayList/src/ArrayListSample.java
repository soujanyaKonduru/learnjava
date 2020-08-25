import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays cannot expand
		// ArrayList cann expand automatically
		
		ArrayList  names = new ArrayList();
		names.add("Soujanya");
		names.add("Konduru");
		names.add("Venkata");
		
		// Printing all the names in array
		for (int i =0;i<names.size(); i++)   // size is the method gives number of items
		{
			System.out.println("name:" +names.get(i)); // get will get the name at given index
		}
		
		// Another way of looping is
		for(Object name : names)
		{
			System.out.println(name);
		}
		
		ArrayList numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		for(int i=0; i<numbers.size(); i++ )
		{
			System.out.println("Numbers: "+ numbers.get(i));
			
		}
		
		for(Object number : numbers)
		{
			System.out.println(number);
		}
		
	}

}
