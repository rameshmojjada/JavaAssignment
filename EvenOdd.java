package seleniumpracticeJ;
public class EvenOdd {
	public static void main(String[] args) {
		int arr[]= {1,2,4,5,8,9};
		for(int i=0;i< arr.length;i++) {
		if(arr[i]%2==0) {
				System.out.println(arr[i] + " is Even number ");
			}else {
				System.out.println(arr[i]+ " is odd number");
			}
		}
	}
}