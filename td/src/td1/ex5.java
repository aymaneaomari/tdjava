package td1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5 {
	public static void main(String[]args) {
	      Scanner input=new Scanner(System.in);
	      System.out.print("enter the number:");
	      int number=input.nextInt();
	      ArrayList<Integer> diviseurs=new ArrayList<>();
	      
	      for(int i=2;i<number;i++) {
	    	  if(number % i ==0)
	    		 diviseurs.add(i);
	    		  
	      }
	      if (diviseurs.isEmpty())
	    	  System.out.print("aucun il est premier ");
	      else
	    	  System.out.print("les propres diviseurs sont: ");
	    	  for(int i:diviseurs)
	    		  System.out.print(i+" ");
	}
}
