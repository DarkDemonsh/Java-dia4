package dia4act5;

import java.util.Scanner;

public class Dia4act5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese valor limite");
        int numlim = leer.nextInt();
        
        System.out.println("ingrese " + numlim + " valores");
        
        while(numlim != 0){
            int num = leer.nextInt();
            numlim = numlim - 1;
            
        }
    }
}
