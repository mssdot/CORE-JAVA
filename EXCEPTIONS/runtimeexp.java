import java.util.*;
public class runtimeexp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a + b;
            System.out.println("addition: " + c );
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
       

    }     
} 