import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				flag=true;
				break;
			}
		}
		if(flag==true) System.out.println("yes");
		else System.out.println("no");
		sc.close();
	}

}
