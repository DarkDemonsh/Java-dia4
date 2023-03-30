package dia5extra7v2;

import java.util.Scanner;

public class Dia5extra7v2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int prom = 0;
        int max = 0;
        int min = 1000000;
        
        System.out.println("escribe la cantidad de numeros que quiera ingresar");
        int num = leer.nextInt();
        
        System.out.println("ingrese los numeros");
        
        do{
            
            int num1 = leer.nextInt();
            
            if (num1 > max){
                max = num1;
            }
            
            if (min > num1){
                min = num1;
            }
            
            prom = prom + num1;
            
            num = num - 1;
        }while(num != 0);
        
        System.out.println("el numero maximo es: "+max);
        System.out.println("el numero minimo es: "+min);
        System.out.println("el promedio es: "+prom);
        
    }
    
}
