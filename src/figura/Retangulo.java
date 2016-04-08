
package figura;

public class Retangulo implements FiguraGeom{
	
	protected double a;  
    protected double b;  

    
    public Retangulo(double a, double b) {  
        this.a = a;  
        this.b = b;  
    }      
    
    
    @Override  
    public double area() {  
        return a * b;  
    }  
  

  
 	@Override
	public double perimetro() {
		return (a * 2) + (b * 2); 
	
	}  

}
