package dia4act3;

import java.util.Scanner;

public class Dia4act3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("escribe una palabra de 8 letras");
       
       String wor = leer.next();
       int num = wor.length();
       
       if ( num == 8 ){
           
           System.out.println("la palabra es correcta");
           
       }else{     
           
           System.out.println("la palabra es incorrecta");
           
       }
       }
    }
    
