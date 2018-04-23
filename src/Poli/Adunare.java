package Poli;
import java.util.*;





public class Adunare implements OperatiiBi {
	
	private Polinom p1;
	private Polinom p2;
	private Polinom p3;
	

	
	
	public Adunare(Polinom p1, Polinom p2) {
		this.p1 = p1;
		this.p2 = p2;
		p3=new Polinom();
	}
	
	
	public Polinom Rezultat( ){
		final  List<Monom> suma =new ArrayList<Monom>();
	
	for(int i=0;i<p1.getPolinom().size();i++){
			suma.add(p1.getPolinom().get(i));
			
		} 
		
		for(int j=0;j<p2.getPolinom().size();j++){
			suma.add(p2.getPolinom().get(j));
			
		} 
		
		
		for(int i=0;i<suma.size()-1;i++){
			suma.get(i);
			for(int k=i+1;k<suma.size();k++){
				if( suma.get(i).getGrad()==suma.get(k).getGrad()){
					
					
					double c=suma.get(i).getCoeficient()+suma.get(k).getCoeficient();
					suma.get(i).setCoeficient(c);
					suma.remove(k);
				
				}
				
				
				
			}
		
				
		} 
		
		
		for (int c = 0;  c < ( suma.size() - 1 ); c++) {
	      for (int d = 0; d < suma.size() - c - 1; d++) {
	        if (suma.get(d).getGrad() < suma.get(d+1).getGrad()) 
	        {
	         Monom swap       =  new Monom(suma.get(d).getCoeficient(),suma.get(d).getGrad() );
	         suma.get(d).setGrad(suma.get(d+1).getGrad());
	         suma.get(d).setCoeficient(suma.get(d+1).getCoeficient());
	         suma.get(d).setGrad(suma.get(d+1).getGrad());
	         suma.get(d+1).setGrad(swap.getGrad());
	         suma.get(d+1).setCoeficient(swap.getCoeficient());
	         
	        }
	      }
	    }
	
		
		
for(int i=0;i<suma.size();i++){
			
			if(suma.get(i).getCoeficient()==0){
				
				suma.remove(i);
				
			}
		}
	
		
		for(int i=0;i<suma.size();i++){
			
			p3.setPolinom(suma.get(i));
		}
	
	
		return p3;
	}
	
	
	

}
