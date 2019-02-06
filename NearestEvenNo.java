import java.util.Scanner;

public class NearestEvenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		if(n%2==0)
			System.out.println(n);
		else
			System.out.println(n-1);
		sc.close();
	}

}
