package week3.day2assignments;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		Automation aut=new Automation();
		aut.Java();
		aut.Selenium();
		aut.python();
		aut.ruby();

	}
	
	public void ruby() {
		System.out.println("I am in ruby()- automation");
		
	}

	public void Selenium() {
		System.out.println("I am in Selenium()- automation");
		
	}

	public void Java() {
		System.out.println("I am in Java()- automation");
		
	}
	//public void python() {
	//	System.out.println("Iam in python()- automation");
	//}

}
