import java.util.Random;



public class EserciziMatrice {
    
    public static void main(String[] args){
        matrice(6,"f");
    }
    public static void matrice (int numMatrice, String carattere){ 
        String  [] [] quadrato = new String[numMatrice][numMatrice];
        
        /*for(i=0; i < quadrato.length; i++) {
            for(j=0; j < quadrato.length; j=j+1) {
              quadrato[i][j]=0;
            }
          }*/



          for(int i=0; i < quadrato.length; i++) {
            for(int j=0; j < numMatrice; j++) {
                
                
              System.out.print(quadrato[i][j] + " ");
            }
            System.out.println(quadrato[i]);
          }

        }    
        


          //Matrice random 

          //int random [] [] = new int [4] [3];










          //Matrici



        
    
}

