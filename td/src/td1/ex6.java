package td1;

import java.util.Scanner;

public class ex6 {
	public static void main(String[]args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the number of therme u want ");
	    int n = input.nextInt();
	    int a=1 ,b=0,c;
	    for(int i=1;i<=n;i++) {
	     c=b+a;
	     System.out.print(c+" ");
	     b=a;
	     a=c;
	     
	     }
	     
	     
	}
}
