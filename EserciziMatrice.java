public class EserciziMatrice {
    
    public static void main(String[] args){
       
        
        int quadrato [] [] = new int[7] [7];
        int i, j;
        for(i=0; i < quadrato.length; i++) {
            for(j=0; j < quadrato.length; j=j+1) {
              quadrato[i][j]=0;
            }
          }

          for(i=0; i < quadrato.length; i++) {
            for(j=0; j < quadrato.length; j++) {
              System.out.print(quadrato[i][j]+" ");
            }
            //System.out.println(quadrato);
          }


        
    }
}

