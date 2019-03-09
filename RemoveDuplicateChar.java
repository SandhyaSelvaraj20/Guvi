import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res="";
		for(int i=0;i<str.length();i++) {
			if(!(res.contains(str.substring(i,i+1)))) {
				res+=str.substring(i,i+1);
			}
		}
		System.out.println(res);
		sc.close();
	}

}
