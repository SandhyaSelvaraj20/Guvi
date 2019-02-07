import java.util.Scanner;

public class StringSubstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		  int k=sc.nextInt();
		  System.out.println(str.substring(0,k));
		sc.close();
	}

}
