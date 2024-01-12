package td2;

public class banque {
private Integer Ncompte;
private String CIN;
private Float solde;
static int  numeroDesComptes=1;


public banque(String cIN) {

	CIN = cIN;
	this.Ncompte= numeroDesComptes;
	numeroDesComptes++;
}
public banque( String CIN, Float solde) {
	this.Ncompte = numeroDesComptes;
	this.setCIN(CIN);
	this.setSolde(solde);
	numeroDesComptes++;
}
public Integer getNcompte() {
	return Ncompte;
}
public String getCIN() {
	return CIN;
}
public void setCIN(String CIN) {
	this.CIN = CIN;
}
public Float getSolde() {
	return solde;
}
public void setSolde(Float solde) {
	if(solde>0)
	this.solde = solde;
	else 
		System.out.println("tu ne peux pas ajotuer un solde negative");
}
public void deposer(float soldeDeposer) {
	if (soldeDeposer>0)
		if(this.getSolde()==null)
			this.setSolde(soldeDeposer);
		else
			this.setSolde(this.getSolde()+soldeDeposer);
	else 
		System.out.println("tu neux peux pas deposer un solde negative");
}
public float avoiresolde() {
	if(this.getSolde()==null)
		return 0;
	else
	return this.getSolde();
}

public String avoireinfo() {
	if(this.getSolde()==null)
	return "Ncompte:"+this.getNcompte()+"\nSolde:"+0.00+"\nCin:"+this.getCIN();
	else
		return "Ncompte:"+this.getNcompte()+"\nSolde:"+this.getSolde()+"\nCin:"+this.getCIN();
}

}
