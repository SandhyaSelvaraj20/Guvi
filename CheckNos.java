import java.util.Scanner;

public class CheckNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=1 && n<=10)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}

}
