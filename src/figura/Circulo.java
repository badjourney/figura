
package figura;

public class Circulo implements FiguraGeom{
	
	protected double raio;
	final double PI = 3.14;
	
    public Circulo(double a) {  
        this.raio = a;  
         
    } 	
	

	@Override
	public double area() {
		return (raio * raio) * PI;
	}

	@Override
	public double perimetro() {
		
		return (2 * raio) * PI;
	}
	

}

