package dia6extra14;

import java.util.Scanner;

public class Dia6extra14 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int i = 0;
       int n = 0;
       int a = 0;
       int s = 0;
       
       System.out.println("Escribir cantidad de Familias");
       int f = leer.nextInt();
       
       while(f != 0){
        i = i + 1;
        
        System.out.println("Cantidad de hijos de la familia: "+i);
        int h = leer.nextInt();
        
        n = h;
        
        while(n != 0){
            a = a + 1;
            System.out.println("Escribir edad del °"+a +" hijo");
            int e = leer.nextInt();
            n = n-1;
            if (s < e){
                s = e;
            }
        }
        System.out.println("la media de edad de los hijos de la familia "+ i + " es " + s + " años");
        System.out.println(" ");
            s = 0;
            a = 0;
            f = f -1; 
    }  
    }
    
}
