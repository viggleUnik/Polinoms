package Poli;

public class Integrare  implements OperatiiMono {
	
	
	
	private Polinom p1;
	private Polinom p2;
	
	
	public Integrare(Polinom p1) {
		
		this.p1 = p1;
		p2=new Polinom();
	}
	
	public Polinom Result(){
		
		for(int i=0;i<p1.getPolinom().size();i++){
			double coef=p1.getPolinom().get(i).getCoeficient()/((p1.getPolinom().get(i).getGrad())+1);
			int grad=p1.getPolinom().get(i).getGrad()+1;
			
			p1.getPolinom().get(i).setCoeficient(coef);
			p1.getPolinom().get(i).setGrad(grad);	
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
