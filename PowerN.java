import java.util.Scanner;

public class PowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println((int)Math.pow(x, y));
		sc.close();
	}

}
