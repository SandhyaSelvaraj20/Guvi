import java.util.Scanner;

public class Multiple13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%13==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		sc.close();
	}
}
