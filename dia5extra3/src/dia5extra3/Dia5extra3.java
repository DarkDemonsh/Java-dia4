package dia5extra3;

import java.util.Scanner;

public class Dia5extra3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Escribir una letra");
    
    String vocal = leer.next();
    
    if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")){
        
        System.out.println("la letra se trata de una vocal");
        
    }else{
        System.out.println("la letra no es una vocal");
    }
    
    }
    
}
