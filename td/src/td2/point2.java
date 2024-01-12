package td2;

public class point2 {
double x;
double y;
char nom;

public point2(double x, double y, char nom) {
this.setNom(nom);
this.setX(x);
this.setY(y);
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public char getNom() {
	return nom;
}

public void setNom(char nom) {
	this.nom = nom;
}

public double norme() {
	return Math.sqrt(Math.pow(this.getX(), 2) +Math.pow(this.getY(), 2));
}


}

