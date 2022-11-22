import java.util.Scanner;

public class Prova {
    public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digita un qualsiasi numero o digita '0' per fermare il programma");
            
            int a = scan.nextInt();
            
            while(a != 0){
                System.out.println("Digita un qualsiasi numero");
                int x = scan.nextInt();
                int sum = a + x;
                System.out.println(sum);
            } 
            if(a == 0){
                System.out.println("Arrivederci");
            }
                
                
                scan.close();
            
    }
}
