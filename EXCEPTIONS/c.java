// method call stack
import java.util.*;
public class c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //methoda();
        try{
            methoda();
        }
      

        catch(ArithmeticException e){
            System.out.println("ae caught in main ()" );
            e.printStackTrace();
        }


    }

    private static void methoda() {
        methodb();
        //    try{
        //     methodb();
        //    }
        //    catch(ArithmeticException e){
        //     System.out.println("ae caught in method a()" );
        //     e.printStackTrace();
        //    }
            
    }

    private static void methodb() {  // here exception not  handled its responsiblity of its caller environment i.e,, methoda()
        System.out.println("in method b" );
        try{
            int c = 2/0;
             System.out.println(c );
        }
        finally{
            System.out.println("method b" );
        }
        
    }     
} 