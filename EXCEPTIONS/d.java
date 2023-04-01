//throw throws
import java.util.*;
public class d {
    
    public static void main(String args[]) {
        
            // Scanner sc = new Scanner(System.in);
            // methoda(sc);
         
        
            // System.out.println("main exit" );


            try{
                Scanner sc = new Scanner(System.in);
                 methoda( sc);
         
            }
            catch(ArithmeticException e){
                System.out.println("arthimetic exception" );
                e.printStackTrace();
            }
            System.out.println("exit main()" ); // in case of caughted exception or no exception
        


    }  
    public static void methoda( Scanner sc) throws ArithmeticException{
        int a =5;
        int b = sc.nextInt(); 
        if( b ==0) throw new ArithmeticException();
        else System.out.println("value is" + a/b );


    }   
} 