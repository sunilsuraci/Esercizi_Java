import java.util.Scanner;

public class EserciziAll {

    public static void Decrescente() {
        Scanner input = new Scanner(System.in);
        
        boolean flag = true;
        while (flag){
            System.out.println("Inserisci un numero da 5 cifre: ");
            int a = input.nextInt();
            if(9999 < a && a < 100000){
                flag = false;
                for(int i = a; i >= 150; i = i -2) {
                    System.out.println("Numero invalido");
                }

            }
        }

        input.close();
    }

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


    //Funzione


    public static void Funzione (){
        Scanner input = new Scanner(System.in);
       
        boolean flag = true;
        while(flag){
            System.out.println("Digita un qualsiasi numero: ");
            int a = input.nextInt();
            
        } 
        
        
        input.close();
    }


    //Valore Assoluto


        
    

    //Rimuovere elemento array
    
    public  static int [] rimuoviElemento(int [] lista, int posizione){
        
        if (lista == null || posizione < 0 || posizione >= lista.length){
            
        }

        return lista;

    }


    public static void main(String[] args){
        Compreso(50,44,14);
        PariDispari(6);

        int [] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};



        rimuoviElemento(lista, 4);
    }
    
}
