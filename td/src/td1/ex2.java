package td1;

import java.util.Scanner;

public class ex2 {
	public static void main(String[]args) {
	Scanner size=new Scanner(System.in);
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number of element u want to store: ");
    int n=size.nextInt();
    int array[]=new int[n] ;
    System.out.println("enter the value of elements");
    for(int i=0;i<n;i++) {
    	System.out.print("n"+i+"=");
        array[i]=input.nextInt();
    }
    System.out.println("ur numbers are:");
    for(int i=0;i<n;i++)
    	System.out.print("n"+i+"="+array[i]+"  ");
        
	System.out.println();
	   for(int i=0;i<n;i++) {
	    array[i]=array[i]*3;
	}
	   System.out.println("ur triplets numbers are:");
	    for(int i=0;i<n;i++)
	    	System.out.print("n"+i+"="+array[i]+"  ");
		
	}}
