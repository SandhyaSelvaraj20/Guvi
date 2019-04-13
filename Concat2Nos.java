import java.util.Scanner;

public class Concat2Nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String s1 = n1+"";
		String s2 = n2+"";
		System.out.println(s1+s2);
		sc.close();
	}
}
