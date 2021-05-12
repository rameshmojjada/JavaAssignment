package seleniumpracticeJ;
public class CountDuplicate {
	public static void main(String[] args) {	
		int arr[] = {2,2,3,4,5,44,44,6,6};
		int count=0;
		int len = arr.length;
		for(int i =0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}System.out.println(count);
	}
}