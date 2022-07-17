package aaa;
import java.util.Scanner;
public class mySchool {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Wie nennst du deine Schule?");
		String schule = myscanner.nextLine();
		
		System.out.println("Du warst in "+schule);
		
		

	}

}
