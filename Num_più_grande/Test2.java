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
        

        


    }
}


