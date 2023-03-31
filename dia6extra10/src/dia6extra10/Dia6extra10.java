package dia6extra10;

import java.util.Scanner;

public class Dia6extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numr = (int) Math.floor(Math.random() * 11);
        
        System.out.println("ingrese un valor entre 1-10");
        
        int num = leer.nextInt();
        
        do{
            if(num != numr){
                System.out.println("el numero no es el correcto, intenta nuevamente");
                num = leer.nextInt();
            }else{             
        System.out.println("en efecto el numero es "+ numr +" felicidades"); 
        break;
            }
        }while(num != 0);
 
    }
    
}
