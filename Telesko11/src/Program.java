interface portable
{
	void carry(); 
}


abstract class Computer 
{
	public abstract void code ();							// Abstract method always belongs to Abstract class
	public abstract void playVideo();                       // abstract method  with semicolon whereas defining method not
	public void compute()
	{														// Defining method
	System.out.println("computing");	
	}
}
class Laptop extends Computer implements portable
{
	public void code()
	{
	System.out.println("write code in laptop");
	}
	public void playVideo()
	{
	System.out.println("playing video in laptop ");
	}
	public void carry() {
	System.out.println("let's go .......");	
	}
}
class Desktop extends Computer
{
	public void  code()
	{
		System.out.println("write a code in desktop");
	}
	public void playVideo() {
		System.out.println("play video in desktop");	
	}
}
class Phone extends Computer implements portable
{
	public void code() {
		System.out.println("coding on phone");	
	}
	public void playVideo() {
		System.out.println("watching video on phone is not clear");	
	}
	public void carry() {
		System.out.println("let's go.....");
		
	}
	
}
public class Program
{
	public static void main(String[] args)
	{
		Desktop obj2 = new Desktop();
		Alien a1 = new Alien();
		a1.build(obj2);
		
	}

}
