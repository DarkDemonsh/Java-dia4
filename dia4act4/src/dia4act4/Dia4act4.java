package dia4act4;

import java.util.Scanner;

public class Dia4act4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escribe una palabra cuya primera letra sea (A)");
        
        String wor = leer.next();
        
       String wor1 = wor.substring(0,1);
        
        if (wor1.equals("a")){
            
            System.out.println("CORRECTO");
            
        }else if (wor1.equals("A")){
            
            System.out.println("CORRECTO");
            
        }else{
            
            System.out.println("INCORRECTO ");
            
        }
    } 
}
