package dia5extra6;

import java.util.Scanner;

public class Dia5extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int bajos = 0;
        int altos = 0;
        
        System.out.println("Ingrese numero de personas");
        int num = leer.nextInt();
        
        while (num != 0){
            System.out.println("ingresar la estatura en |Mts| de las personas");
            float est = leer.nextFloat();
            num = num - 1;
            
            if (est <= 1.60){
                bajos = bajos + 1;
            }else{
                altos = altos + 1;
            }
        }
        
        System.out.println("el promedio de personas que miden mas de 1.60 es: " + altos);
        System.out.println("el promedio de personas que miden menos de 1.60 es: " + bajos);
        
    }
    
}
