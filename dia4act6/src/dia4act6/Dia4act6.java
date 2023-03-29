package dia4act6;

import java.util.Scanner;

public class Dia4act6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese 2 numeros enteros");
       
       int num = leer.nextInt();
       int num1 = leer.nextInt();
       int num2 = 1;
       
       while (num2 == 1){
           
           System.out.println("MENU");
           
           System.out.println("1-Sumar");
           System.out.println("2-Restar");
           System.out.println("3-Multiplicar");
           System.out.println("4-Dividir");
           System.out.println("5-Salir");
           
           System.out.println("ingrese la opcion");
           int num3 = leer.nextInt();
           
           switch(num3){
               case 1: System.out.println("Los numeros sumados dan: " + (num + num1));
               break;
               
               case 2: System.out.println("Los numeros restados dan: " + (num - num1));
               break;
               
               case 3: System.out.println("Los numeros multiplicados dan: " + (num * num1));
               break;
               
               case 4: System.out.println("Los numeros divididos dan: " + (num / num1));
               break;
               
               case 5: System.out.println("¿Seguro que quiere salir? (S/N)");
               String ext = leer.next();
               
               if (ext.equals("s")){
                   
                   System.out.println("A-dios");
                   num2 = 0;
                   
               }else if (ext.equals("S")){
                   
                   System.out.println("A-dios");
                   num2 = 0;
                   
               }else if (ext.equals("n")){
                   
                   System.out.println("Volviendo al menu");
                   
               }else if (ext.equals("N")){
                   
                   System.out.println("Volviendo al menu");
                   
               }else{
                   System.out.println("la letra nisiquiera esta escrita en las opciones");
                   System.out.println("");
                   System.out.println("SALIENDO...");
                   num2 = 0;
               }
               }    
               }
       }
       }
