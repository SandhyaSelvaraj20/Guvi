import java.util.Scanner;

public class PrintNpowK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int res=1;
		for(int i=1;i<=k;i++) {
			res = res*n;
		}
		System.out.println(res);
		sc.close();
	}
}
