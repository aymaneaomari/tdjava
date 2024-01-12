package td1;

import java.util.Scanner;

public class ex3 {
	 public static void main(String[]args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("entrer le nombre:");
		 int number=input.nextInt();
		 int result=1;
		 while(result==0) {
		 	 result=number%2;
		 	number=number/2;
		 }
		 if(result==0) {
		 	System.out.print("le nombre est divisible par 2");
		 }
		 else if(result==1) {
		 	System.out.print("Le nombre n'est pas divisible par 2");
		 }
		  }  
}
