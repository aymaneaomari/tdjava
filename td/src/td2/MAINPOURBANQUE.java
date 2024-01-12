package td2;
import java.util.*;
public class MAINPOURBANQUE {

	public static void main(String[] args) {
		ArrayList<banque> listCompte=new ArrayList<banque>();
		while(true) {
		Scanner s=new Scanner(System.in);
		System.out.println("----system de banque----");
		System.out.println("entrer votre choix ");
		System.out.println("1-creer une compte");
		System.out.println("2-j'ai deja une compte");
		Integer choix1 =s.nextInt();
		int ncompte=1;
		if(choix1==1) {
		
			Scanner s2=new Scanner(System.in); 
			System.out.println("entrer votre CIN");
			String Cin=s2.nextLine();
			listCompte.add(new banque(Cin));	
			System.out.println("felicitation votre compte a éte créer");
			;
			System.out.println("le numero de votre compte est:"+ncompte);
			ncompte++;
		}
		else if(choix1==2) {
			
			Scanner s3=new Scanner(System.in);
			System.out.println("entrer votre Cin");
			String Cin=s3.nextLine();
			System.out.println("entrer votre Ncompte");
			Integer Ncompte=s3.nextInt();
			for(banque c:listCompte) {
				
					if(c.getNcompte().equals(Ncompte)&&c.getCIN().equals(Cin)) {
						while(true) {
					Scanner s4=new Scanner(System.in);
					System.out.println("bienvenu dans espace client");
					System.out.println("Les services dispo");
					System.out.println("1-avoire Solde");
					System.out.println("2-avoire Informations");
					System.out.println("3-deposer un solde");
					System.out.println("4-exit");
					Integer choix4=s4.nextInt();
					if(choix4==1)
						System.out.println(c.avoiresolde());
					else if(choix4==2)
						System.out.println(c.avoireinfo());
					else if(choix4==3) {
						Scanner soldeIn=new Scanner(System.in);
						System.out.println("enter le solde a deposer");
						float soldeDeposer=soldeIn.nextFloat();
						c.deposer(soldeDeposer);
						System.out.println("le solde a éte deposer ");
					}
					else if(choix4==4)
						break;
					}}
				else System.out.println("le compte non exsite");	
			}
			
		}
		else
			System.out.println("choix introuvable");
	}
	}
}
