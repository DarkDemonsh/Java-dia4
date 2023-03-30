package dia5extra2;

public class Dia5extra2 {

    public static void main(String[] args) {        
        
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        System.out.println("los 4 numeros son: ");
        
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("D: "+d);
        
        int e = b;
        
        b = c;
        c = a;
        a = d;
        d = e;
        
        System.out.println("los numeros cambiados de valor quedarian: ");
        
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("D: "+d);
    }
    
}
