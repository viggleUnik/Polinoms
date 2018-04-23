package Poli;

public class Monom {

	private int grad;
	private double coeficient;
	
	public Monom(double coeficient, int grad ) {
		this.coeficient=coeficient;
		this.grad=grad;
		
	}

	public int getGrad() {
		return grad;
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	public double getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}

	

}
