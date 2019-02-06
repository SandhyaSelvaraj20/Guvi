import java.util.Scanner;

public class AlphaNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		
		int num=0,alpha=0;
		for(int i=0;i<s.length();i++) {
			if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z'))
				alpha=1;
			else if(ch[i]>='0' && ch[i]<='9')
				num=1;
		}
		if(alpha==1 && num==1) System.out.println("yes");
		else System.out.println("no");
		sc.close();
	}

}
