import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		ch=Character.toLowerCase(ch);
		if(ch>=97 && ch<=122)
			System.out.println("Alphabet");
			else
				System.out.println("No");
	}

}
