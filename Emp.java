package seleniumpracticeJ;
import java.util.ArrayList;
import java.util.Iterator;
public class Emp {
	public static void main(String[] args) {
		Emp e1 = new Emp(1000, "Vijay",   170000);
		Emp e2 = new Emp(2000, "Prasad",  260000);
		Emp e3 = new Emp(3000, "Alapati", 355000);
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Iterator<Emp> itr = al.iterator();
		while(itr.hasNext()) {
			Emp emp = (Emp)itr.next();
			System.out.println(emp.EmpID +" " + emp.EmpName " " + emp.Empsal);
		}
	}
}
class Emp{
	int EmpID;
	String EmpName;
	int Empsal;
	Emp(int EmpID, String EmpName, int Empsal) {
		this.EmpID= EmpID;
		this.EmpName= EmpName;
		this.Empsal= Empsal;
	}
}