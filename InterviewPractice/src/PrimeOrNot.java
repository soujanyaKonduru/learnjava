import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
	
		for(int i=2;i<=num/2;i++)
		{
		 count = 0;
			if(num % i == 0)
			{
				count ++;
				break;
			}
							
		}
		
		if ( count == 0 && num != 1)
		{
			System.out.print(num +" Is a Prime number ");
		}
		else
		{
			System.out.print(num +" Not a Prime ");
		}
		

	}

}
