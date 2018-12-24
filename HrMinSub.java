import java.util.Scanner;

public class HrMinSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr1 = sc.nextInt();
		int min1 = sc.nextInt();
		int hr2 = sc.nextInt();
		int min2 = sc.nextInt();
		System.out.print(Math.abs(hr1-hr2)+" ");
		System.out.print(Math.abs(min1-min2));
	}

}
