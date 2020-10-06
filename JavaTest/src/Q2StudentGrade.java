import java.util.Scanner;

public class Q2StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your grade");
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		String str = sc.nextLine(); //reads string.
				
		if(str.equals("Kindergarden")||str.equals("1st grade")|| str.equals("2nd grade") || str.equals("3rd grade") || str.equals("4th grade") || str.equals("5th grade"))
		{
			System.out.println("You are in Elementary school");
			
		}
		else if(str.equals("6th grade") || str.equals("7th grade")  || str.equals("8th grade"))
		{
			System.out.println("You are in middle school");
		}
		else
		{
			System.out.println("You are in high school or college");
		} 

	}

}


