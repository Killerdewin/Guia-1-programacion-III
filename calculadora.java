
package ejercicio;

public class calculadora {
    
    public double a,b,c;
    
    
    public void suma(){
        c=a+b;
    }
    
    public void resta(){
        c=a-b;
    }
    
    public void multiplicacion(){
        c=a*b;
    }
    
    public void division(){
        c=a/b;
    }
    
    public void seno(){
        c = Math.sin(a);
    }
    
    public void coseno(){
        c = Math.cos(a);
    }
    
    public void tangente(){
        c = Math.tan(a);
    }
    
    public void raiz(){
        c = Math.sqrt(a);
    }
    
    public void exponente(){
        c = a*a;
    }
    
    public void IVA(){
        c = (19*a)/100;
    }
   
}
        