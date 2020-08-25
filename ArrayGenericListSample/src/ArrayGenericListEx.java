import java.util.ArrayList;

public class ArrayGenericListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The problem with above ArrayList is we want only strings to be in the list, but we can add other than strings also like below
	    ArrayList names = new ArrayList();
	    names.add("sai");
	    names.add("ram");
	    names.add("krishna");

	    names.add(10);  // addding numbers
	    names.add(12.2);    // adding decimals
	    names.add(true);    // adding booleans */
		// Generic ArrayList will solve the problem where we can put only certain things like below
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("soujanya");
		names.add("Konduru");
		names.add("Venkata");
		
		for(int i=0; i<names.size();i++)
		{
			System.out.println("Names: "+names.get(i));
		}
		
		
		for( String name : names)
		{
			System.out.println("Name: " +name);
		}
		
	}

}
