package dia6extra13;

import java.util.Scanner;

public class Dia6extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("ingrese el tamaño de la escalera");
        int num = leer.nextInt();
        System.out.println("");
        
        for(int i = 0; i < num; i++){
             num1 = 0;
        for(int n = 0; n < i; n++){
              num1 = num1 + 1;
               
                System.out.print(num1);
               
    }
        num2 = num2 + 1;
        System.out.println(num2);
    }
      System.out.println(" ");
}}

