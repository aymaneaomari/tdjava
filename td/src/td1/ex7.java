package td1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex7 {
	 public static void main(String[]args){
		 Scanner input=new Scanner(System.in);
		 ArrayList<Double> notes=new ArrayList<Double>();
		 System.out.println("enter the notes(enter zero to stop)");
		 while(true) {
		 	double note=input.nextDouble();
		 	if(note==0 || note < 0  ||note > 20) {
		 		break;}
		 	notes.add(note);
		 }
		 System.out.println("notes");
		 double somme=0,numberofnote=0;

		 for(double i:notes) {
		 	somme=somme+i;
		 	numberofnote++;
		 }
		 double result=somme/numberofnote;
		 System.out.print("ta moyenne est ="+result);
		 if(result>14) {
		 	System.out.print("Très Bien");
		 }
		 else if(result>12 && result<=14){
		 	System.out.print(" Bien");
		 }
		 else if(result<=12 && result>10){
		 	System.out.print(" Passable");
		 	
		 }
		 else {
		 	System.out.print( "Non admis");
		 } 
		 	 }
}
