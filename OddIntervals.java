import java.util.Scanner;

public class OddIntervals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		for(int i=n+1;i<s;i++) {
			if(i%2 != 0)
				System.out.print(i+" ");
		}
	}
}
