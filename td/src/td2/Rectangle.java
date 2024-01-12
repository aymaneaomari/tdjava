package td2;

public class Rectangle {
Double largeur;
Double longueur;
public Rectangle(Double largeur, Double longueur) {
	
}
public Rectangle() {
}
public Rectangle(Rectangle r) {
	
}
public Double getLargeur() {
	return largeur;
}
public void setLargeur(Double largeur) {
	if(largeur>0)
	this.largeur = largeur;
	else
		System.out.println("largeur must be positive");
}
public Double getLongueur() {
	return longueur;
}
public void setLongueur(Double longueur) {
	if(longueur>0)
	this.longueur = longueur;
	else 
		System.out.println("longueur must be positive");
}
public Double Perimetre() {
	return 2*(this.getLargeur()+this.getLongueur());
}
public double Aire() {
	return this.getLargeur()*this.getLongueur();
}
public boolean isCarre() {
	if (this.getLargeur()==this.getLongueur())
		return true;
	else 
		return false;
	
}
@Override
public String toString() {
	return "Rectangle [largeur=" + largeur + ", longueur=" + longueur + "]";
}

}
