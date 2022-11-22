import java.util.Scanner;

public class Prova {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean flag = true;
        while (flag){
            System.out.println("Inserisci un numero da 5 cifre: ");
            int a = input.nextInt();
            if(9999 < a && a < 100000){
                flag = false;
                for(int i = a; i >= 150; i = i -2) {
                    System.out.println(i);
                }

                }else{
                    System.out.println("Numero non valido");
                }
                input.close();
            }
        }

       
    }

