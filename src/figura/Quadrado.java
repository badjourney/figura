
package figura;

public class Quadrado implements FiguraGeom {
	
	protected double a;
	
	
    public Quadrado(double a) {  
        this.a = a;  
         
    } 

	@Override
	public double area() {
		return a * a;
	}

	@Override
	public double perimetro() {
		return a * 4;
	}
	
	

}

