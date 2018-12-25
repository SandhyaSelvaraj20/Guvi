import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int k = sc.nextInt();
		for(int i=1;i<=k;i++) {
			System.out.println(s);
		}
		sc.close();
	}

}
