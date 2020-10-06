
public class Q7ExceptionStudent {
	
	
	public void getPermit(int age) throws Exception
	{
		
		if ( age<13) 
		{
			 Exception e;     // declaring exception variable
		        e = new Exception("You are not allowed to drive");   // creating Exception object
		        throw e;     // throwing exception object.
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q7ExceptionStudent es = new Q7ExceptionStudent();
		try {
			es.getPermit(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
