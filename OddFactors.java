import java.util.Scanner;

public class OddFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i+=2) {
			if(n%i==0)
				System.out.print(i+" ");
		}
		System.out.println();
		sc.close();

	}

}
