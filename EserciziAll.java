public class EserciziAll {

    //Decrescente//
   /*  public static int Calcola (int num){
        return num;
    }; */

    //Compreso

public static int Compreso (int a, int b, int c){
    if ((a>b & c<b) || (a<b & c>b)){
        System.out.println(b + " e' compreso tra " + a + b);
        return b;
    }else {
        System.out.println(b + " Non e' compreso tra i due numeri" + a + c);
        return b;
    }
};


    public static void main(String[] args){
        Compreso(7,22,14);
    }
    
}
