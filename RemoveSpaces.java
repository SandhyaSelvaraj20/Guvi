import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll(" ", "");
		System.out.println(str);
		sc.close();

	}

}
