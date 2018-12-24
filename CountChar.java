import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len;
		str=str.replaceAll(" ","");
		len=str.length();
		System.out.println(len);
	}
}
