
package operacionesbasicas;

public class operaciones {
    
    int dato1=0, dato2=0, resultado=0;
    
    public operaciones(){
        
    }
    
    public void setsuma (int a, int b){
        dato1=a;
        dato2=b;
        this.resultado=dato1+dato2; 
    }
    
    public void setresta (int a, int b){
        dato1=a;
        dato2=b;
        this.resultado=dato1-dato2; 
    }
    
    public void setdivision (int a, int b){
        dato1=a;
        dato2=b;
        this.resultado=dato1/dato2; 
    }
    
    public void setmultiplicacion (int a, int b){
        dato1=a;
        dato2=b;
        this.resultado=dato1*dato2; 
    }
    
    public void imprimirResultado(){
        System.out.println("El resultado es = "+resultado);
    }
}
