//create thread by implementing runnable interface
import java.util.*;
class test implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("in  test thread" );
        } 
       
    }
}
public class way2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Thread t = new Thread(new test());
        t.start();
        for(int i=0;i<5;i++) {
            System.out.println(" in main thread" );
        } 
        

          


    }     
} 