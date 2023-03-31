package dia6extra12;

public class Dia6extra12 {

    public static void main(String[] args) {

        int n = 0;
        int n1 = 0;
        int n2 = 0;
        String e = "E";
                
        for(int i = 1; i <= 10; i++){
            
            int nr = (int) Math.floor(Math.random() * 9);
            int n1r = (int) Math.floor(Math.random() * 9);
            int n2r = (int) Math.floor(Math.random() * 9);
            
            n = nr;
            n1 = n1r;
            n2 = n2r;

            if (n == 3){
            System.out.println(e + "-" + n1 + "-" + n2);
            }else if (n1 == 3){
            System.out.println(n + "-" + e + "-" + n2);
            }else if (n2 == 3){
            System.out.println(n + "-" + n1 + "-" + e);
            }else{
            System.out.println(n + "-" + n1 + "-" + n2);
            }
        
    }
    
}}
