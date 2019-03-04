import java.util.Scanner;

public class Ceil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		System.out.println((int)Math.ceil(num));
		sc.close();
	}

}
