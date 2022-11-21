public class Test {
    public static void main(String[] args){
        int numGiri = 5;
        int num1 = 0;
        int num2 = 1;
        int tot = 0;
        for(int i=0; i<numGiri; ++i){
            System.out.println(tot);
            num1 = num2;
            num2 = tot;

            tot = num1 + num2;

            
            
        }
        
    }
}
