import java.util.Scanner;

public class PrintHoliday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		switch(str) {
		case "saturday": System.out.println("yes");
		                 break;
		case "sunday": System.out.println("yes");
						break;
		default: System.out.println("no");
		}
		sc.close();
	}

}
