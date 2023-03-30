package dia5extra4;

import java.util.Scanner;

public class Dia5extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String rom = " ";
        
        System.out.println("ingresar un numero entre el 1-10");
        
        int num = leer.nextInt();
        
        if (num > 0 && num < 11 ){
            if (num == 1){
               rom = "I";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 2){
               rom = "II";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 3){
               rom = "III";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 4){
               rom = "IV";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 5){
               rom = "V";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 6){
               rom = "VI";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 7){
               rom = "VII";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 8){
               rom = "VIII";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 9){
               rom = "IX";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }else if (num == 10){
               rom = "X";
               System.out.println("el numero "+num+" en romano es: "+rom);
            }
        }else{
           System.out.println("el numero no esta entre 1-10"); 
        }}}
