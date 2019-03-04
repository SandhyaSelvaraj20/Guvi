import java.util.Scanner;

public class PerfectSqr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n =sc.nextInt();
		int res=m*n;
		boolean flag=false;
		for(int i=1;i<res/2;i++) {
			if(i*i==res) {
				flag=true;
				break;
			}
		}
		 if(flag) {
			 System.out.println("yes");
		 }
		 else {
			 System.out.println("no");
		 }
		 sc.close();
	}

}
