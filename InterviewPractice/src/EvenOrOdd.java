import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		
		if(num%2 == 0)
		{
			System.out.print("Even number");
			
		}
		else
		{
			System.out.println(" ODD number");
		}
		
	}

}
