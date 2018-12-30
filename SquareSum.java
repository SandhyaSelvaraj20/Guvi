import java.util.Scanner;

public class SquareSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r,sum=0;
		while(n>0) {
			r = n%10;
			sum = sum + (int)Math.pow(r, 2);
			n = n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
