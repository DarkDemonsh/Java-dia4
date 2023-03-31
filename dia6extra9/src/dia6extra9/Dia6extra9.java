package dia6extra9;

import java.util.Scanner;

public class Dia6extra9 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int c = 0;
       
       System.out.println("Escribe 2 numeros enteros mayores que 1");
       
       int num = leer.nextInt();
       int num1 = leer.nextInt();
       
    if(num1 > num){ 
        
       while(num1 > num){               
           num1 = num1 - num;
           c = c + 1;   
       }
       
    }else{ 
        
        while(num > num1){           
            num = num - num1;
            c = c + 1;
       }
    }
       
       if(num < num1){
       System.out.println("El residuo es: " + num);
       }else if(num1 < num){
           System.out.println("El residuo es: " + num1);
       }      
       System.out.println("El cociente es: " + c);   
    }
}
