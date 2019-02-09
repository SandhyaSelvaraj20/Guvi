import java.util.Scanner;

public class BinaryRep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1' || str.charAt(i)=='0') {
				count++;
			}
			else
				continue;
		}
		if(count==str.length())
			System.out.println("yes");
		else
			System.out.println("no");
           sc.close();
	}

}
