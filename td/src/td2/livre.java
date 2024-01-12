package td2;
import java.sql.Date;

public class livre {
String titre;
String auteur;
String date;
Double prix;
public livre(String titre, String auteur, String date, Double prix) {

	this.setTitre(titre);
	this.setAuteur(auteur);
	this.setDate(date);
	this.setPrix(prix);
}
public livre(String titre, String auteur) {
	
	this.titre = titre;
	this.auteur = auteur;
}

public livre(String titre, String auteur, Double prix) {

	this.titre = titre;
	this.auteur = auteur;
	this.prix = prix;
}

public livre(String titre) {

	this.titre = titre;
}
public livre(livre l)
{
this.setTitre(l.getTitre());
this.setAuteur(l.getAuteur());
this.setPrix(l.getPrix());
this.setTitre(l.getTitre());

}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	if(date.matches("\\d{4}-\\d{2}-\\d{2}"))
	this.date = date;
	else 
		System.out.println("date format not valid");
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}


public String toString() {
	return "livre [titre=" + titre + ", auteur=" + auteur + ", date=" + date + ", prix=" + prix + "]";
}

}
