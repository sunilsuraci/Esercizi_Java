import java.util.Scanner;

public class Prova {
    public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digita un qualsiasi numero o digita '0' per fermare il programma");
            
            int a = scan.nextInt();
            int sum = 0;
            while(a != 0){
                
                sum = sum + a;
                System.out.println(sum);
                System.out.println("Digita un qualsiasi numero o digita '0' per fermare il programma");
            
             a = scan.nextInt();
            } 
            if(a == 0){
                System.out.println("Arrivederci");
            }
                
                
                scan.close();
            
    }
}
