package Poli;

import java.util.ArrayList;
import java.util.List;

public class Inmultire  implements OperatiiBi {
	private Polinom p1;
	private Polinom p2;
	private Polinom p3;
	

	
	
	public Inmultire(Polinom p1, Polinom p2) {
		this.p1 = p1;
		this.p2 = p2;
		p3=new Polinom();
	}
	
	
	
	public Polinom Rezultat(){
		
		final  List<Monom> inm =new ArrayList<Monom>();
		
		for(int i=0;i<p1.getPolinom().size();i++){
			for(int k=0;k<p2.getPolinom().size();k++){
				double c=p1.getPolinom().get(i).getCoeficient()*p2.getPolinom().get(k).getCoeficient();
				int g=p1.getPolinom().get(i).getGrad()+p2.getPolinom().get(k).getGrad();
				
				Monom m= new Monom(c,g);
				inm.add(m);
				
				
			}
		
				
		} 
		
	for(int i=0;i<inm.size()-1;i++){
			inm.get(i);
			for(int k=i+1;k<inm.size();k++){
				if( inm.get(i).getGrad()==inm.get(k).getGrad()){
					
					
					double coef=inm.get(i).getCoeficient()+inm.get(k).getCoeficient();
					inm.get(i).setCoeficient(coef);
					inm.remove(k);
				
				}
				
				
				
			}
		
				
		} 
		
		
for(int i=0;i<inm.size();i++){
			
			if(inm.get(i).getCoeficient()==0){
				
				inm.remove(i);
				
			}
		}

for (int c = 0;  c < ( inm.size() - 1 ); c++) {
    for (int d = 0; d < inm.size() - c - 1; d++) {
      if (inm.get(d).getGrad() < inm.get(d+1).getGrad()) 
      {
       Monom swap       =  new Monom(inm.get(d).getCoeficient(),inm.get(d).getGrad() );
       inm.get(d).setGrad(inm.get(d+1).getGrad());
       inm.get(d).setCoeficient(inm.get(d+1).getCoeficient());
       inm.get(d).setGrad(inm.get(d+1).getGrad());
       inm.get(d+1).setGrad(swap.getGrad());
       inm.get(d+1).setCoeficient(swap.getCoeficient());
       
      }
    }
  }
		
for(int i=0;i<inm.size();i++){
	
	p3.setPolinom(inm.get(i)); 
}
				
		
		
		return p3;
	}
	
	

}
