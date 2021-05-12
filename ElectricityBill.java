package seleniumpracticeJ;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		String livingtype;
		int nounits,Bill;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the type of living: Residential, Commercial");	
		livingtype = input.nextLine();
		System.out.println("Enter the nounits");
		nounits = input.nextInt();
		switch (livingtype) {
		case "Residential":
				if (noofunits <=100) {
					Bill= nounits*3;
				}else if(noofunits>=100 && nounits<=500) {
						Bill = nounits*4;
				}else {
					System.out.println("Units Out of range");
					}
				break;
		case "Commercial":
				if (noofunits <=100) {
					Bill= nounits*10;
				}else if(nounits>=100 && nounits<=500) {
						Bill = nounits*20;
				}else {
					System.out.println("Units Out of range");
					}
				break;
			}
	}
}