package td2;

public class point {
char nom;
double abscisse;
public point(char nom, double abscisse) {
	this.nom = nom;
	this.abscisse = abscisse;
}
public void translate(double x ) {
	this.abscisse+=x;
}
public void information() {
	System.out.println("nom:"+this.nom+" abscisee:"+this.abscisse);
}

}

