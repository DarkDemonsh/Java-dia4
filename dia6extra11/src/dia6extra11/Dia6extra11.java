package dia6extra11;

import java.util.Scanner;

public class Dia6extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i = 0;
        int n = 0;
        
        System.out.println("Escriba un numero");
        
        int num = leer.nextInt();
        
        while(num != 0){
            i = i + 1;
            
            n = trun num / 10;
            
            
        }
        
        System.out.println(n);
        System.out.println(i);
        System.out.println(num);
    }
    
}
