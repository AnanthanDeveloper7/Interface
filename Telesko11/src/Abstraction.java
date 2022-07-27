abstract class Computer 
{
	public abstract void code ();							// Abstract method always belongs to Abstract class
	public abstract void playVideo();                       // abstract method  with semicolon whereas defining method not
	public void compute()
	{														// Defining method
	System.out.println("computing");	
	}
}
class Laptop extends Computer
{
	public void code()
	{
	System.out.println("write code in laptop");
	}
	public void playVideo()
	{
	System.out.println("playing video in laptop ");
	}
}
public class Abstraction {
	public static void main(String[] args) {
//		Computer com = new Computer();   			// can't create obj for abstract class  , create obj for implimentation class
		Computer com = new Laptop();
		com.code();
		com.compute();
		com.playVideo();
		
	}

}
