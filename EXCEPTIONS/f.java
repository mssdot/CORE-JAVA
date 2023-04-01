//multiple exceptions
import java.util.*;
public class f {
    public static void main(String args[]) {
       
        try{
            Scanner sc = new Scanner(System.in);
            methoda();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
          
        finally{
            System.out.println("end of method main()" );
        }

    } 
    public static void methoda(){
        
        try{
 
           int c = 2/0;
            System.out.println("value: " + c );
        }
        catch(ArithmeticException e ){
            System.out.println("arithmetic exception" );
        }
        finally{
            System.out.println("end of methoda() " );
        }
    }    
} 