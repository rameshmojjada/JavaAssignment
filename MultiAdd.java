package seleniumpracticeJ;
public class MultiAdd {
	public static void main(String[] args) {
		int i, num=10, sum=0;
		int j, number=10,mul=1;	
         for(j=1; j<=num; j++) {
			mul=mul*j;
		} 
		System.out.println("The multiplication of first 10 numbers is :" + mul);
	
		for(i=1; i<=num; i++) {
	
			sum= sum+i;
		} System.out.println("The sum of first 10 nunbers is :" + sum);
		
	
	}
		
}