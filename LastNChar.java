import java.util.Scanner;

public class LastNChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n =sc.nextInt();
		System.out.println(str.substring(str.length()-n));
	    sc.close();

	}
}
