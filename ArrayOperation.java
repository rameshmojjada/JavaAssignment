package seleniumpracticeJ;
public class ArrayOperation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,5,8,8,7,9};
		int sum=0; 
		int mul=1;
		int len = arr.length;
		for(int i=0;i<len; i++) {
			sum=sum + arr[i];
			mul=mul*arr[i];
			for(int j=1+i; j<len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		System.out.println("Sum of numbers in array :" +sum);
		System.out.println("Multiplication of numbers in the array :" +mul);
	}
}