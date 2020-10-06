
public class PrimeNumbers1and100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, count;
		int num =0;
		
		System.out.println("Prime numbers from 1 to 100 are :");
		
		for(num =1;num <=100; num ++)
		{
			count = 0;
			
			for( i=2;i<= num/2; i++)
			{
				if(num%2 == 0)
					count ++;
				break;
				
			}
			if ( count ==0 && num !=1)
			{
				System.out.print(num + " ");
			}
			
		}
		
		
	}

}
