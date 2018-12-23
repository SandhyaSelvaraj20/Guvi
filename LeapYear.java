import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      if((n%400==0) || (n%4==0 && n%100!=0))
    	System.out.println("Yes");
      else
    	  System.out.println("No");
	}
}

