package Poli;

import java.util.*;


public class Polinom {
	public String polica1;
	public List<Monom> polinom=new ArrayList<Monom>();
	
	public Polinom(){};

	public  void setPolinom(Monom monom){
		
		this.polinom.add(monom);
			
	}
	
	
	public  List<Monom> getPolinom(){
	
		return polinom;	
			
	}

	
	
	///din string in polinom
	public void toPolinom( String polica1){
		String mon_str;
		
		int j=0;
	
		int k=polica1.length();
		for (int i=1; i<k; i++){
			
			
			j++; 
			
				if( polica1.charAt(j)=='+' || polica1.charAt(j)=='-'){
					
					mon_str= polica1.substring(0,j);
					
					polica1=polica1.substring(j, polica1.length());
					
					j=0;				
					this.setPolinom( transform(mon_str));	
				}
				
				
	      		}
			
			
			
		}
		
		
		
	//////din string in monom
	
			private Monom transform(String mon_str ){
			
			 double coef=0;
			
			int i=0,k;
			int grad=0;
			String z="";
			k=mon_str.length();
			while( i!=k){
				if(mon_str.charAt(i)=='X' ){
					z=mon_str.replace("X", "");
				}
				
				i++;
				
			}
			
			
			
			
			for (i=0;i <z.length(); i++){
			
				//pt coeficient
				if(z.charAt(i) == '^')
				{	
				 coef=Double.parseDouble(z.substring(0,i));
				 
				 
				grad=Integer.parseInt(z.substring(i+1, z.length()));
				
				}			
			}
			Monom m=new Monom(coef,grad);
			return m;
	
			}
			
			////////////in string	
			public String toString( ){
				String polic="";
				for(int i=0; i<polinom.size(); i++){
					double c=polinom.get(i).getCoeficient();
					int g=polinom.get(i).getGrad();
					if( c >= 0 ){
						polic+="+"+c+"X^";			
					
					}
					else{
						
						polic+=c+"X^";
					}
					
					polic+=g;
					
					
					
				}
				
			return polic;	
			}


			
			
			


}
			
	
		




