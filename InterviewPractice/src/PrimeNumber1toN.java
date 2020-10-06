import java.util.Scanner;

public class PrimeNumber1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count, num, min, max;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min number");
		min = sc.nextInt();
		
		System.out.println("Enter max number");
		max = sc.nextInt();
		
		System.out.println("Prime Numbers are");
		
		for(num =min;num<=max;num++)
		{
			count = 0;
			for(i=2;i<=num/2;i++)
			{
				if(num % i == 0)
				{
					count ++;
					break;
				}
								
			}
			
			if ( count == 0 && num != 1)
			{
				System.out.print(num +" ");
			}
		}
		
	}

}
