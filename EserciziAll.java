import java.util.Scanner;

public class EserciziAll {

    //Decrescente//
   /*  public static int Calcola (int num){
        return num;
    }; */

    //Compreso

    public static int Compreso (int a, int b, int c){
        if ((a>b & c<b) || (a<b & c>b)){
            System.out.println(b + " e' compreso tra " + a +" e " + c);
        return b;
        }else {
            System.out.println(b + " Non e' compreso tra i due numeri " + a + " e " + c);
        return b;
        }
    };

    //Pari e dispari


    public static int PariDispari(int a) {
        if ((a % 2) == 0 ) {
            System.out.println(a + " e' un numero Pari");
            
        } else {
            System.out.println(a + " Non e' un numero Pari");
        }return a;
    }


    //Sommatrice 


    public static void Sommatrice(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digita un qualsiasi numero");
    do{
        
        int a = scan.nextInt();
        
    } while (a == 0);
        
        
        
    }

        
    


    public static void main(String[] args){
        Compreso(50,44,14);
        PariDispari(6);
    }
    
}
