package Poli;

public class Scadere  implements OperatiiBi {
	private Polinom p1;
	private Polinom p2;
	
	public Scadere(Polinom p1, Polinom p2) {
		this.p1 = p1;
		for(int i=0;i<p2.getPolinom().size();i++){
		p2.getPolinom().get(i).setCoeficient( (-1)*p2.getPolinom().get(i).getCoeficient());
		
		}

	
			this.p2=p2;		
		
		
		
		
		new Polinom();
	}
	
	public Polinom Rezultat(){
		
		
		Adunare rezultat = new Adunare(p1,p2);
		

		
		
		
		return (rezultat.Rezultat());
	} 
	
	
	
	

}
