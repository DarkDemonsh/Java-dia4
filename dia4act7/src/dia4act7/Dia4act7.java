package dia4act7;

import java.util.Scanner;

public class Dia4act7 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int inc = 0;
       int cor = 0;
       String txtb = ("a");
       
       do{
       
       System.out.println("Ingrese una cadena de 5 caracteres que empieze por (X) y termine en (O)");
       System.out.println("para salir escribir (&&&&&)");
       
       String txt = leer.next();
       
       int num = txt.length();
       String txtx = txt.substring(0,1);
       String txty = txt.substring(4,5);
       
       if ((txtx.equals("X")) && (txty.equals("O")) && (num == 5)){
           cor = cor + 1;
       }else{
           inc = inc + 1;
       }
       
       if (txt.equals("&&&&&")){
           txtb = txt;
       }
       
    }while(txtb.equals("a"));
       
       System.out.println("cantidad de lecturas incorrectas: " + inc);
       System.out.println("cantidad de lecturas correctas: " + cor);
       
 }}