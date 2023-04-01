//user defined exceptions
import java.io.FileNotFoundException;
import java.util.*;
class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String msg){
        super(msg );

    }
}

public class g {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bal;
        try{
            bal = Integer.parseInt(args[0]);
            updatebal(bal);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch(InvalidBalanceException e){
            
            e.printStackTrace();// it prints System.out.println(e ); first then method call stack later
        }
        finally{
            System.out.println("end of main()" );
        }
          


    }

    private static void updatebal(int bal) throws InvalidBalanceException  {
        if(bal<1) throw new InvalidBalanceException("balance can't less than 1");
        else System.out.println("no exception" );
    }     
} 


/*  out put with super(msg):
    InvalidBalanceException: balance can't less than 1
	at g.updatebal(g.java:35)
	at g.main(g.java:15)
    end of main()
   

    out put without super(msg):
    InvalidBalanceException
	at g.updatebal(g.java:33)
	at g.main(g.java:13)
    end of main()
 * 
 * 
 */