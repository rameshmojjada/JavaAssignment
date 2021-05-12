package seleniumpracticeJ;
public class PrimeNumcheck {
	public static void main(String[] arg)
	{
		int num=30;
		boolean flag= false;
		for (int i=2; i<=num/2; i++)
		{
			//condition for non prime number 
			if(num%i== 0)
			{
				flag= true;
				break;
			}
		}	
			if(!flag)
			System.out.println(num + " is Prime number");
			else
				System.out.println(num + " is not prime number");
		}
	}