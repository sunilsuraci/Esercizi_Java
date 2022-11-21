package Num_più_grande;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
         ilPiuGrande(6, 8);
    }
    public static int ilPiuGrande (int num1, int num2) {
        if(num1 > num2){
            System.out.println(num1 + "è più grande");
            return num1;
        } else {
            System.out.println(num2 + "è più grande");
        }
        return num2;
        

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Digita un qualsiasi numero");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Digita il secondo numero");
        int num2 = scan.nextInt();

        int num3 = Math.max(num, num2);

        System.out.println("Il più grande tra i due numeri è " + num3);

        scan.close();*/
        


    }
}


