package Poli;


public class Impartire {
	
	private Polinom p1;
	private Polinom p2;
	private Polinom p3;
	private Polinom aux;

	int i=0;
	public Impartire(Polinom p1, Polinom p2) {
	
		p3=new Polinom();
		aux=new Polinom();
	
		if(p1.getPolinom().get(0).getGrad()>=p2.getPolinom().get(0).getGrad()){
			this.p1=p1;
			this.p2=p2;
		}
		else if(p1.getPolinom().get(0).getGrad()<p2.getPolinom().get(0).getGrad()){
			this.p1=p2;
			this.p2=p1;
		}
		}
	
	
	
	public Polinom Rezultat(){
		
		
		
		if(p1.getPolinom().size()==1 && p2.getPolinom().size()==1){
			double coef=p1.getPolinom().get(0).getCoeficient()/p2.getPolinom().get(0).getCoeficient();
			int grad=p1.getPolinom().get(0).getGrad()-p2.getPolinom().get(0).getGrad();
			Monom m=new Monom(coef, grad);
			p3.setPolinom(m);
			
		}
		
		else{ 
			
			while( p2.getPolinom().get(0).getGrad()<=p1.getPolinom().get(0).getGrad()){
				double coef=p1.getPolinom().get(0).getCoeficient()/p2.getPolinom().get(0).getCoeficient();
				int grad=p1.getPolinom().get(0).getGrad()-p2.getPolinom().get(0).getGrad();
				Monom m=new Monom(coef,grad);
				p3.setPolinom(m);
				
				
				aux.setPolinom(m);
				aux= new Inmultire(p2, aux).Rezultat();
				p1=new Scadere(p1,aux).Rezultat();
				
				aux.getPolinom().clear();
				
				if(p1.getPolinom().size()==0){
					
					break;
					
				}	
				i++;	
			}
			
			
			
			
		}
		
		
		
		return p3;
	}
	
	public Polinom Restul(){
		return p1;
	}
	
	
	
	

}
