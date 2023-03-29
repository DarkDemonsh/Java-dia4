package dia.pkg4.act.pkg1;

import java.util.Scanner;

public class Dia4Act1 {
    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un numero");
        
        int num = leer.nextInt();
        
        if (2 % num != 0) { 
                System.out.println("el numero es impar");
        }else{
                System.out.println("el numero es par");
    }}
    
}
