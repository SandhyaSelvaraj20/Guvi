import java.util.Scanner;

public class ProductEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if((m*n)%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		sc.close();

	}

}
