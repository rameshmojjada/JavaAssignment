package seleniumpracticeJ;
import java.util.Scanner;
public class HotelBill {
	public static void main(String[] args) {
		int itemNo;
		int noofplates, Amount;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item number:");
		itemNo = input.nextInt();
		System.out.println("Enter the number of plates you need:");
		noofplates= input.nextInt();
		switch(itemNo) {
		case 1:
			Amount = noofplates*20;
			System.out.println("Total Dosa cost:" + Amount);
			break;
		case 2:
			Amount = noofplates*10;
			System.out.println("Total idli cost:" + Amount);
			break;
		case 3:
			Amount = noofplates*30;
			System.out.println("Total Dosa cost:" + Amount);
		}
	}

}