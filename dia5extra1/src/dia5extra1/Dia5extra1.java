package dia5extra1;

import java.util.Scanner;

public class Dia5extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia = 0;
        System.out.println("ingrese cantidad de minutos");
        
        int min = leer.nextInt();
        
        int hora = min / 60;
        while (hora > 24){
            dia = dia + 1; 
            hora = hora - 24;     
        }
        if (dia >= 2){
        System.out.println("el tiempo total seria: " + dia + " dias " + hora + " horas");
        }else{
            System.out.println("el tiempo total seria: " + dia + " dia " + hora + " horas");
        }
    }
    
}
