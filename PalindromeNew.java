import java.util.Scanner;

public class PalindromeNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		if(str.equals(res))
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}

}
