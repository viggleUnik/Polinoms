package Poli;

public class Derivare implements OperatiiMono {
	
	private Polinom p1;
	private Polinom p2;
	
	
	public Derivare(Polinom p1) {
		
		this.p1 = p1;
		p2=new Polinom();
	}
	
	public Polinom Result(){
		
		for(int i=0;i<p1.getPolinom().size();i++){
		p1.getPolinom().get(i).setCoeficient(p1.getPolinom().get(i).getCoeficient()*(p1.getPolinom().get(i).getGrad()));
		p1.getPolinom().get(i).setGrad((p1.getPolinom().get(i).getGrad()-1));	
		} 
		
		
		
		for(int i=0;i<p1.getPolinom().size();i++){
			p2.setPolinom(p1.getPolinom().get(i));
			
		} 
		
		
for(int i=0;i<p2.getPolinom().size();i++){
			
			if(p2.getPolinom().get(i).getCoeficient()==0){
				
				p2.getPolinom().remove(i);
				
			}
		}
		
		
		
		return p2;
	}
	
	

}
