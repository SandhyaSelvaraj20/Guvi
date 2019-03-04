import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r;
		String res ="";
		while(n>0) {
			r=n%10;
			if(r%2!=0) {
			res=r+" "+res;
			}
			n=n/10;
		}
		System.out.println(res);
		sc.close();
	}
}
