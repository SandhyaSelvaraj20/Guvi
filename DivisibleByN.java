import java.util.Scanner;

public class DivisibleByN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				flag=true;
		}
		if(flag==true)
			System.out.println("yes");
		else
			System.out.println("no");
         sc.close();

	}

}
