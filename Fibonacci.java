import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
