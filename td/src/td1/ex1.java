package td1;

import java.util.Scanner;
public class ex1{
	public static void main(String[]args) {
		Scanner size=new Scanner(System.in);
	    Scanner input=new Scanner(System.in);
	    System.out.println("enter the number of element u want to store" );
	    int n=size.nextInt();
	    int array[]=new int[n] ;
	    System.out.println("enter the value of elements");
	    for(int i=0;i<n;i++) {
	    	System.out.print("n"+i+"=");
	        array[i]=input.nextInt();
	    }
	    System.out.println("ur numbers are");
	    for(int i=0;i<n;i++)
	    	System.out.println("n"+i+"="+array[i]  );

		int somme=0 ;
		int S=0;
		   for(int i=0;i<n;i++) {

		    	somme=somme+array[i];
		   S+=1;
		}
			float result ;
			result=somme;
			System.out.print("moyenne is=" +result);
			
} } 