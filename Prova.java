import java.util.Scanner;

public class Prova {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digita un qualsiasi numero: ");
        int a = input.nextInt();
        System.out.println("digita un altro numero: ");
        int b = input.nextInt();
        if (a > b){
            System.out.println(a + " e' più grande di: " + b);
        } else if (a < b ){
            System.out.println(b + " e' più grande di: " + a);
        } else{
            System.out.println( a + " sono uguali " + b);
        }
        
        
        input.close();
    }
}
