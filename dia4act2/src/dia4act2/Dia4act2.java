package dia4act2;

import java.util.Scanner;


public class Dia4act2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escribe la palabra (eureka)");
        
        String wor = leer.next();
        
        if (wor.equals("eureka") ){
            
            System.out.println("la palabra es correcta");
            
        }else{
            
            System.out.println("la palabra es incorrecta");
            
        }
    } 
}
