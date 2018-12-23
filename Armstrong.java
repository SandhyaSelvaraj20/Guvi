import java.util.*;
import java.lang.*;
import java.io.*;

public class Armstrong {

	public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
	
	     int n=sc.nextInt();
	 
	     int r=0;
	     int res=n;
	     int s=0;
	     while(n>0){
	             r=n%10;
	             s=s+(int)Math.pow(r,3);
	             n=n/10;
	         }
	         if(res==s)
	         System.out.println("Yes");
	         else
	         System.out.println("No");
	 }
}
