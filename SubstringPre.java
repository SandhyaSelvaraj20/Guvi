import java.util.Scanner;

public class SubstringPre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m =sc.next();
		String n =sc.next();
		if(m.contains(n))
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
		
	}

}
