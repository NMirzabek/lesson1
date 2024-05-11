import java.util.Scanner;

public class ForthProgram {
	public static void main(String[] a) {


		Scanner scanner = new Scanner(System.in);
		String name, surName;
		System.out.print("Your name: ");
		name = scanner.next();
		System.out.print("Your surname: ");
		surName = scanner.next ();
		System.out.println("Hello " + name + " " + surName);
	}
		}