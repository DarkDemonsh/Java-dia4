package dia5extra5;

import java.util.Scanner;

public class Dia5extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num = 1000;
        int num1 = 0; 
        
        System.out.println("ingrese que tipo de socio eres");
        System.out.println("tipo A,B o C");
        
        String soc = leer.next();
        
        if (soc.equalsIgnoreCase("A")){
            num1 = 50*num/100;
            System.out.println("el coste del tratamiento es: $" + (num - num1) + " con un 50% de descuento");
        }else if (soc.equalsIgnoreCase("B")){
            num1 = 35*num/100;
            System.out.println("el coste del tratamiento es: $" + (num - num1) + " con un 35% de descuento");
        }else if (soc.equalsIgnoreCase("C")){
            System.out.println("el coste del tratamiento es: $" + num + " usted no tiene descuento");            
        }else{
            System.out.println("numero de socio no encontrado");
        }
    }
    
}
