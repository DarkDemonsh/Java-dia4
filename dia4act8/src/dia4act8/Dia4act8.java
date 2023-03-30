package dia4act8;

import java.util.Scanner;

public class Dia4act8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escribe un numero para el tamaño del cuadrado");
        int num = leer.nextInt();
        
        for (int num1 = 1; num1 < num; num1++){ 
        for (int num2 = 1; num2 < num; num2++){ 
    
        if((num1 > 1) && (num1 < num) && (num2 > 1) && (num2 < num)){ 
        System.out.print("  ");
        }else{
        System.out.print("* "); 
            
    }
         
    }   
        System.out.println("* ");
    }
      for (int num1 = 0; num1 < num; num1++){  
          for (int num2 = 1; num2 < num; num2++){ 
       
    }
      System.out.print("* ");
    }
      System.out.println(" ");
    }
}
