import java.util.Scanner;

public class Vow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
	
        
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("Vowels");
		else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println("Consonants");
		else
			System.out.println("Invalid");
			
	}

}
