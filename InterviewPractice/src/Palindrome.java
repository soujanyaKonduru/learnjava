import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original, reveerse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 Original = sc.nextLine();
		int length = Original.length();
		
		
		for (int i = length-1;i >=0; i--)
		{
			reveerse = reveerse +Original.charAt(i);
		}
			if (Original.equals(reveerse))
			{
				System.out.print("palindromenumber");
			}
			else
			{
				System.out.print("Not Palindrome number");
			}
		
		
		
		
		
	}

}
