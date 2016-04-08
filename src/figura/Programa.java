package figura;

import java.util.*;


public class Programa {
         
    public static void main(String[] args) {
        
        List<FiguraGeom> figuras = new ArrayList<>();
        FiguraGeom f1 = new Retangulo (10,  15);
        FiguraGeom f2 = new Quadrado (8);
        FiguraGeom f3 = new Retangulo (18,  15);
        FiguraGeom f4 = new Circulo (7);
        
        
        figuras.add(f1);
        figuras.add(f2);
        figuras.add(f3);
        figuras.add(f4);
        
        for (FiguraGeom f : figuras){
            System.out.println("Perimetro: " +f.perimetro());
            System.out.println("Area: " +f.area());
        }
    }
    
}
