import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=0;
		int c=0;
		while(n>0) {
			r=n%10;
			c++;
			n=n/10;
		}
		System.out.println(c);
	}

}
