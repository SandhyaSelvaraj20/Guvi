import java.util.Scanner;

public class DivBy2Rec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		while(n%2==0) {
			if(n%2==0)
				n = n/2;
			else 
				break;
		}
		System.out.println(n);
		sc.close();
	}
}
