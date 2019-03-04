import java.util.Scanner;

public class MidElementStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
		int len=str.length()/2;
		String result="";
		if(str.length()%2==0) {
			result=str.substring(0,len-1)+"**"+str.substring(len+1);	
		}
			else {
				result=str.substring(0,len)+"*"+str.substring(len+1);
			}
			System.out.println(result);
			sc.close();
	}	

}
