package td1;

import java.util.Scanner;

public class ex4 {
	 public static void main(String[]args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("entrer le premier nombre\nX:");
		 int x=input.nextInt();
		 System.out.print("entrer le deuxieme nombre\nY:");
		 int y=input.nextInt();
		 int min=Math.min(x, y),max=Math.max(y, x);
		 int result=1;
		 while(result!=0) {
		 result=max%min;
		 max=min;
		 min=result;

		 }
		 System.out.print("le pgcd est:"+max);

		 	
		  }  
}
