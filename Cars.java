package seleniumpracticeJ;
public class Cars {
	public String wheels = "4 wheels";
	public String outercover = "Fiber and Steel";
	public void speed() {
		System.out.println("highest speed is 280kmph");
	}
	public void capacity() {
		System.out.println("Minimum 4 and maximum 7");
	}
	public void milage() {
		System.out.println("Milage is bit less");
	}
}
class Honda extends Cars{
	public String type ="Luxary car";
	public void features() {
		System.out.println("This includes all modern hitech smart features");
	}
}