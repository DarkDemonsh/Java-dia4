package dia5extra8;

import java.util.Scanner;

public class Dia5extra8 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int par = 0;
       int impar = 0;
       int cnum = 0;
       int i = 1;
       
       System.out.println("escribe numeros enteros");
       System.out.println("ADVERTENCIA: SI EL NUMERO ES MULTIPLO DE 5 SE DENTENDRA LA LECTURA");
       
       do{
           
        int num = leer.nextInt();
           
        if (2 % num != 0) { 
            impar = impar + 1;
            cnum = cnum + 1;
        }else{
            par = par + 1;
            cnum = cnum + 1;
    }
     
        if (num % 5 == 0){
            break;
        }
        
       }while(i == 1);
       
       System.out.println("cantidad de numeros pares: "+par);
       System.out.println("cantidad de numeros impares: "+impar);
       System.out.println("cantidad de numeros: "+cnum);
       
    }
    
}
