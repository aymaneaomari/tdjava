package td2;

public class temps {
int heures;
int minutes;
int secondes;


public temps() {
}

public temps(int heures) {
	this.setHeures(heures);
}

public temps(int heures, int minutes) {
	this(heures);
	this.setMinutes(minutes);
}

public temps(int heures, int minutes, int secondes) {
	this.setHeures(heures);
	this.setMinutes(minutes);
	this.setSecondes(secondes);
}
public temps(temps t) {
	this.setHeures(t.getHeures());
	this.setMinutes(t.getMinutes());
	this.setSecondes(t.getSecondes());
}
public int getHeures() {
	return heures;
}
public void setHeures(int heures) {
	if(heures>0 && heures<24)
	this.heures = heures;
	else 
		System.out.println("heure out of bounds");
}
public int getMinutes() {
	return minutes;
}
public void setMinutes(int minutes) {
	if(minutes>0&&minutes<60)
	this.minutes = minutes;
	else
		System.out.println("minutes out of bounds");
}
public int getSecondes() {
	return secondes;
}
public void setSecondes(int secondes) {
	if(secondes>0 && secondes<60)
	this.secondes = secondes;
	else
		System.out.println("scondes out of bounds");
}
public void addHeures (int heures) {
	if((this.getHeures()+heures)<24)
		this.heures+=heures;
	else
		this.heures=(this.heures+heures)%24;
}
public void addMinutes (int minutes) {
	if((this.getMinutes()+minutes)<60)
		this.minutes+=minutes;
	else
		this.minutes=(this.getMinutes()+minutes)%60;
		this.addHeures(this.getMinutes()+minutes/60);
}
public void addSecondes (int secondes) {
	if((this.getSecondes()+secondes)<60)
		this.secondes+=secondes;
	else 
		this.secondes=(this.getSecondes()+secondes)%60;
		//this.addMinutes(this.getMinutes()+(secondes/60));
}

@Override
public String toString() {
	return "heures=" + heures + ", minutes=" + minutes + ", secondes=" + secondes ;
}

}
